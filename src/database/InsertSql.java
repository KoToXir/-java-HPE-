package database;

import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertSql {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");// class.forname只有运行时才加载，编译时不加载
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hpe", "root", "root");
			java.sql.PreparedStatement ps = con.prepareStatement(" INSERT INTO `hpe`.`vvc`(`vid`, `vname`, `vaddress`, `vcity`, `vstate`, `vzip`, `vcountry`) VALUES (3, ?, 'Apple 1 Infinite Loop Cup', '库比蒂诺', '加州', '8000000', '美国');");
			ps.setString(1, "董明珠");
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
