package database;

import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateSql {

	public static void main(String[] args) {
		String vname = "盖茨";
		String vid = "2";
		try {
			Class.forName("com.mysql.jdbc.Driver");// class.forname只有运行时才加载，编译时不加载
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hpe", "root", "root");
			java.sql.PreparedStatement ps = con.prepareStatement(" update vvc set vname = ? where vid = ?");
			ps.setString(1, vname);
			ps.setString(2, vid);
			ps.execute();
			
			ps.close();
			con.close();
		} catch (ClassNotFoundException e) {//加载驱动类时捕获
			e.printStackTrace();
		} catch (SQLException e) {//建立连接时捕获
			e.printStackTrace();
		}
	}

}
