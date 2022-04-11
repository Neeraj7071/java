package com.masai;

public class Course {
	int courseId=1;
	String courseName="java";
	int courseFee=100;
	void displayCourseDetails() {
		Course c1=new Course();
		System.out.print("Course Id:-");
		System.out.println(c1.courseId);
		System.out.print("Course Name:-");
		System.out.println(c1.courseName);
		System.out.print("Course Fee:-");
		System.out.println(c1.courseFee);
	}
	static void authenticate(String username,String password) {
		if(username=="Admin" && password=="1234") {
			Course c=new Course();
			c.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	public static void main(String[] args) {
		Course.authenticate("Admin","1234");
		Course.authenticate("admin","1234");
	}
}
