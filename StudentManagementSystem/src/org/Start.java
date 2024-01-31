package org;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.student.manage.SearchStudent;
import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {
	public static void main(String[] args) {
		System.out.println("++++++++Welecome to student management app+++++++++++ ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				System.out.println("Press 1 to ADD student : ");
				System.out.println("Press 2 to DELETE student : ");
				System.out.println("Press 3 to DISPLAY student : ");
				System.out.println("Press 4 to UPDATE student : ");
				System.out.println("Press 5 to Search student : ");
				System.out.println("Press 6 to exit app : :");
				int c = Integer.parseInt(br.readLine());
				if (c == 1) {
					// add student
					System.out.println("Enter user name : ");
					String name = br.readLine();
					System.out.println("Enter user phone : ");
					String phone = br.readLine();
					System.out.println("Enter user city : ");
					String city = br.readLine();

					// Create student object to store student
					Student st = new Student(name, phone, city);
					boolean result = StudentDao.insertStudentToDB(st);
					if (result) {
						System.out.println("Student is added Succefully.....");
					} else {
						System.out.println("Something went wrong try again-----!!!");
					}
					System.out.println(st);
				} else if (c == 2) {
					// delete student
					System.out.println("Enter Student id to delete : ");
					int userID = Integer.parseInt(br.readLine());
					boolean f = StudentDao.deleteStudent(userID);
					if (f) {
						System.out.println("Deleted......!");
					} else {
						System.out.println("Something went wrong...");
					}
				} else if (c == 3) {
					// display student
					StudentDao.showAllStudents();
				} else if (c == 4) {
//					Update Studet
					System.out.println("Enter student id : ");
					int userID = Integer.parseInt(br.readLine());
					System.out.println("Enter new user name : ");
					String name = br.readLine();
					System.out.println("Enter new user phone : ");
					String phone = br.readLine();
					System.out.println("Enter new user city : ");
					String city = br.readLine();
					boolean bl = StudentDao.updateStudent(userID, name, phone, city);
					if (bl) {
						System.out.println("Record Updated-.-.-..-.--...---.");
					} else {
						System.out.println("Something went wrong...");
					}
				} else if (c == 5) {
//					 Search student
					System.out.println("Search through ID : then press 1 -->");
					System.out.println("Search through Name : then press 2 -->");
					System.out.println("Search through phone : then press 3 -->");
					System.out.println("Search through city : then press 4 -->");
					int res = Integer.parseInt(br.readLine());
					if (res == 1) {
//						search thought id
						System.out.println("Enter id numbere : ");
						int id = Integer.parseInt(br.readLine());
						SearchStudent.throughID(id);
					} else if (res == 2) {
//						search thought name 
						System.out.println("Enter name : ");
						String name = br.readLine();
						SearchStudent.throughName(name);
					} else if (res == 3) {
//						search thought phone 
						System.out.println("Enter phone number : ");
						String phone = br.readLine();
						SearchStudent.throughPhoneNO(phone);
					} else if (res == 4) {
//						search thought city 
						System.out.println("Enter city name : ");
						String city = br.readLine();
						SearchStudent.throughCity(city);
					} else {
						System.out.println("Please Enetr correct input");
					}
				} else if (c == 6) {
					// exit
					break;
				} else {
					System.out.println("Please Enter Correct Input :..:..:..:>>>");
				}
			}
			System.out.println("!---Thanks for using my application---!");
			System.out.println("See you soon.......Bye Bye");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
