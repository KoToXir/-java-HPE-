package database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SecectSql {

	public static void main(String[] args) {
		String sql = "select vid,vname,vaddress,vcity from vvc";//尽量指定列名，不要用*
		
		//为了保存数据
		//Map map = new HashMap();//下方定义！
		List<Map> list = new ArrayList<Map>();
		
		try {
			//1）导入jar包，加载驱动类
			Class.forName("com.mysql.jdbc.Driver");// class.forname只有运行时才加载，编译时不加载
			//2）建立连接
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hpe", "root", "root");
			//3）获取执行sql的statment
			java.sql.PreparedStatement ps = con.prepareStatement(sql);
			//4)处理结果集
			//连接关闭后结果集会清空
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				//两种方式，object对于不了解表结构，getString、getInt对于了解表结构
				//结果集列号从1开始
				/*Object o1 = rs.getObject(1);
				Object o2 = rs.getObject(2);
				Object o3 = rs.getObject(3);
				Object o4 = rs.getObject(4);
				System.out.println( ""+o1 + o2+o3+o4);
				*/
				int vid = rs.getInt("vid");
				String vname = rs.getString("vname");
				
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("vid",vid);
				map.put("vname", vname);
				list.add(map);
				//System.out.println(vid+vname);
			}
			
			for (Map map : list) {
				System.out.println(map.get("vid"));
			}
			
			//5)关闭
			rs.close();
			ps.close();
			con.close();
		} catch (ClassNotFoundException e) {//加载驱动类时捕获
			e.printStackTrace();
		} catch (SQLException e) {//建立连接时捕获
			e.printStackTrace();
		}
	}

}
