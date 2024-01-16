package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudentToDB(Student st) {
		boolean f = false;
		try {
//	        jdbc code
			Connection con = CP.createC();
			String q = "insert into student(sname, sphone, scity) values(?,?,?)";
//			Prepared statement
			PreparedStatement pstmt = con.prepareStatement(q);
//			Set the values of paramenter
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
//			Executer
			pstmt.executeUpdate();
			f = true;

//			con.close();
//			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userID) {
		boolean f = false;
		try {
//	        jdbc code
			Connection con = CP.createC();
			String q = "delete from student where sid=?";
//			Prepared statement
			PreparedStatement pstmt = con.prepareStatement(q);
//			Set the values of paramenter
			pstmt.setInt(1, userID);
//			Execute
			pstmt.executeUpdate();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllStudents() {
		try {
//	        jdbc code
			Connection con = CP.createC();
			String q = "select * from student";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(q);
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3); // column number
				String city = rs.getString("scity"); // or column name

				System.out.println("ID : " + id);
				System.out.println("Name : " + name);
				System.out.println("Phone : " + phone);
				System.out.println("City : " + city);
				System.out.println("-----------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean updateStudent(int userID, String name, String phone, String city) {
		boolean f = false;
		try {
//	        jdbc code
			Connection con = CP.createC();
			String q = "update student set sname=?, sphone=?, scity=? where sid="+userID;
//			Prepared statement
			PreparedStatement pstmt = con.prepareStatement(q);
//			Set the values of paramenter
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, city);
//			Execute
			pstmt.executeUpdate();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
