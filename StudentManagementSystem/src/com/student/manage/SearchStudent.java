package com.student.manage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchStudent {

	public static void throughID(int id) {
//		Searching through id
		String q = "select * from student where sid=" + id;
		try {
//	        jdbc code
			Connection con = CP.createC();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(q);
			while (rs.next()) {
				int ide = rs.getInt(1);
				String namee = rs.getString(2);
				String phonee = rs.getString(3); // column number
				String citye = rs.getString("scity"); // or column name

				System.out.println("ID : " + ide);
				System.out.println("Name : " + namee);
				System.out.println("Phone : " + phonee);
				System.out.println("City : " + citye);
				System.out.println("-----------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void throughName(String name) {
//		Searching through name
		String q = "select * from student where sname=" + "'" + name + "'";
		try {
//	        jdbc code
			Connection con = CP.createC();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(q);
			while (rs.next()) {
				int ide = rs.getInt(1);
				String namee = rs.getString(2);
				String phonee = rs.getString(3); // column number
				String citye = rs.getString("scity"); // or column name

				System.out.println("ID : " + ide);
				System.out.println("Name : " + namee);
				System.out.println("Phone : " + phonee);
				System.out.println("City : " + citye);
				System.out.println("-----------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void throughPhoneNO(String phone) {
//		Searching through phone number
		String q = "select * from student where sphone=" + "'" + phone + "'";
		try {
//	        jdbc code
			Connection con = CP.createC();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(q);
			while (rs.next()) {
				int ide = rs.getInt(1);
				String namee = rs.getString(2);
				String phonee = rs.getString(3); // column number
				String citye = rs.getString("scity"); // or column name

				System.out.println("ID : " + ide);
				System.out.println("Name : " + namee);
				System.out.println("Phone : " + phonee);
				System.out.println("City : " + citye);
				System.out.println("-----------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void throughCity(String city) {
//		Searching through city
		String q = "select * from student where scity=" + "'" + city + "'";
		try {
//	        jdbc code
			Connection con = CP.createC();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(q);
			while (rs.next()) {
				int ide = rs.getInt(1);
				String namee = rs.getString(2);
				String phonee = rs.getString(3); // column number
				String citye = rs.getString("scity"); // or column name

				System.out.println("ID : " + ide);
				System.out.println("Name : " + namee);
				System.out.println("Phone : " + phonee);
				System.out.println("City : " + citye);
				System.out.println("-----------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
