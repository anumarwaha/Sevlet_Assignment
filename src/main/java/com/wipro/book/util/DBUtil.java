package com.wipro.book.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
	public static Connection DBConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/mysql?verifyServerCertificate=false&useSSL=true";
			String uName = "root";
			String pass = "*******";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uName,pass);
			return con;
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver Not Found");
		}
		catch(SQLException e) {
			System.out.println("Could not connect to database");
			e.printStackTrace();
		}
		return null;
	}
}
