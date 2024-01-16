package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;

	public static Connection createC() {
		try {
//		Load the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
//		create the connection ...
			String url = "jdbc:mysql://localhost:3306/studentdb";
			String user = "root";
			String password = "root";
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
