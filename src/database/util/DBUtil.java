package database.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据库操作类
 * 
 *
 */
public class DBUtil {
	// 获取连接
	public static Connection getConnection() {
		try {
			return MyDataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 关闭连接方法
	public static void closeConn(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 查询一条记录的方法
	public static Map<String, Object> getOne(String sql, Object[] params) {
		Connection connection = getConnection();
		Map map = new HashMap();// 最后要返回的数据
		// 3、执行sql
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = connection.prepareStatement(sql);
		
			if (params != null && params.length > 0) {
				// sql中有占位符
				for (int i = 0; i < params.length; i++) {
					prepareStatement.setObject(i + 1, params[i]);// 占位符赋值
				}
			}
	
			// 4、处理结果集	
			ResultSet rs = prepareStatement.executeQuery();
			// 如何获取表中的列的名称。?通过反射的思想。
			ResultSetMetaData metaData = rs.getMetaData();// 获取列的信息
	
			int count = metaData.getColumnCount();// 列的数量 7
	
			while (rs.next()) {// 遍历结果集
				// 获取列名，并作为map的key，封装到map中。
				for (int i = 1; i <= count; i++) {
					String key = metaData.getColumnName(i);
					map.put(key, rs.getObject(key));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
			// 5、关闭连接
			closeConn(connection);
		}
		return map;
	}
	
	// 查询多条记录
	public static List<Map<String,Object>>  getList(String sql,Object[] params){
		Connection connection = getConnection();

		List list = new ArrayList();
		// 3、执行sql
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = connection.prepareStatement(sql);
		
			if (params != null && params.length > 0) {
				// sql中有占位符
				for (int i = 0; i < params.length; i++) {
					prepareStatement.setObject(i + 1, params[i]);// 占位符赋值
				}
			}
	
			// 4、处理结果集	
			ResultSet rs = prepareStatement.executeQuery();
			// 如何获取表中的列的名称。?通过反射的思想。
			ResultSetMetaData metaData = rs.getMetaData();// 获取列的信息
	
			int count = metaData.getColumnCount();// 列的数量 7
	
			while (rs.next()) {// 遍历结果集
				Map map = new HashMap();// 最后要返回的数据
				// 获取列名，并作为map的key，封装到map中。
				for (int i = 1; i <= count; i++) {
					String key = metaData.getColumnName(i);
					map.put(key, rs.getObject(key));
				}
				list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
			// 5、关闭连接
			closeConn(connection);
		}
		return list;
	}
	
	// 
	/**
	 * 执行 增删改的方法
	 * @param sql
	 * @param params
	 * @return
	 */
	public static int update(String sql,Object[] params){
		int res = -1;
		// 获取连接
		Connection connection = getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			if(params != null && params.length > 0){
				for(int i = 0;i < params.length;i ++){
					prepareStatement.setObject(i + 1, params[i]);
				}
			}
			
			res = prepareStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
}
