package Project;

import java.sql.*;

public class Conn {
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///ums","root","");
			return con;
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
	}
}
