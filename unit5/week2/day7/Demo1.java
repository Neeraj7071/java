package com.masai;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Student 1 roll");
		int roll1 =sc.nextInt();
		System.out.println("Student 1 name");
		String name1=sc.next();
		System.out.println("Student 1 Marks");
		int marks1=sc.nextInt();
		Student s1=new Student(roll1, name1, marks1);
		System.out.println("Student 2 roll");
		int roll2 =sc.nextInt();
		System.out.println("Student 2 name");
		String name2=sc.next();
		System.out.println("Student 2 Marks");
		int marks2=sc.nextInt();
		Student s2=new Student(roll2, name2, marks2);
		s1.displayDetails();
		System.out.println(s2);
	}

}
class Student{
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public void displayDetails() {
		 System.out.println(this.roll+" "+this.name+" "+this.marks+" "+this.grade);
	}
	public String toString() {
	      return this.roll+" "+this.name+" "+this.marks+" "+this.grade;
	}
	private char calculateGrade() {
		if (this.marks>=500)
			return 'A';
		else if(this.marks<500 &&this.marks>=400) 
			return'B';
		return 'C';
	}
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade=this.calculateGrade();
	}
}
