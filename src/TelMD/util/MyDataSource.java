package TelMD.util;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * 数据源管理类（连接池）
 *
 */
public class MyDataSource {
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 获取数据连接
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws SQLException{
		// 创建dbcp 数据源
		BasicDataSource bds = new BasicDataSource();

		bds.setUrl("jdbc:mysql://localhost:3306/hpe");
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUsername("root");
		bds.setPassword("root");
		
		bds.setInitialSize(30);
		bds.setMaxActive(30);
		bds.setMinIdle(10);
		bds.setMaxIdle(10);
		bds.setMaxWait(1000);
		
		return bds.getConnection();
	}
}
