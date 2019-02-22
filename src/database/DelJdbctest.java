package database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

/**
 * 删除mysql执行练习
 * 
 * @author mygbo
 *
 */
public class DelJdbctest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String ename = "1";//动态删除参数
		String sql = "delete from vvc where vid  = '"+ ename +"' ";
		//为避免sql注入→，请使用PreparedStatement
		//select * from user where name = 'wwws(任意字符串)' or 1=1  --'
		try {
			Class.forName("com.mysql.jdbc.Driver");// class.forname只有运行时才加载，编译时不加载
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hpe", "root", "root");
			//执行sql，通过sql执行器
			//Statement stat = con.createStatement();//防止sql注入
			java.sql.PreparedStatement ps = con.prepareStatement(" delete from vvc where ename = ?");
			ps.setString(1, ename);
			ps.execute();
			
			//boolean flag = stat.execute(sql);//执行删除操作
			//System.out.println(flag);
			//stat.close();
			ps.close();
			con.close();
		} catch (ClassNotFoundException e) {//加载驱动类时捕获
			e.printStackTrace();
		} catch (SQLException e) {//建立连接时捕获
			e.printStackTrace();
		}
	}

}
