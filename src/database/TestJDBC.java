package database;
/**
 * 连接测试
 */

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			
			Class.forName("com.mysql.jdbc.Driver");//class.forname只有运行时才加载，编译时不加载
			java.sql.Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hpe","root","root");
			System.out.println(con);
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
