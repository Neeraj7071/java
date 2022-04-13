package com.masai;

public class Student {
	int roll;
	String name;
	int marks;
	void displayStudentDetails() {
		System.out.println("Roll is : "+this.roll);
		System.out.println("Name is : "+this.name);
		System.out.println("Marks is : "+this.marks);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.roll=1;
		s1.name="Ram";
		s1.marks=55;
		Student s2=new Student();
		s2.roll=2;
		s2.name="Shyam";
		s2.marks=88;
		
		s1.displayStudentDetails();
		s2.displayStudentDetails();
		
	}
}
