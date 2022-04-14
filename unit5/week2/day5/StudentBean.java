package com.masai;

import java.util.Arrays;
import java.util.Scanner;

public class StudentBean {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of student");
		int n=sc.nextInt();
		Student[] array; 
		array=new Student[n]; 
		Arrays.fill(array,new Student());
		for(int i=0;i<n;i++){
			System.out.println("Enter the Student "+(i+1)+"Roll number");
			array[i].setRoll(sc.nextInt());
			System.out.println("Enter the Student "+(i+1)+"Name");
			array[i].setName(sc.next());
			System.out.println("Enter the Student "+(i+1)+"Address");
			array[i].setAddress(sc.next());
			System.out.println("Enter the Student "+(i+1)+"Marks");
			array[i].setMarks(sc.nextInt());
		}
		printdetail(array,n);
		
	}
	static void printdetail(Student[] a,int n) {
		for(int i=0;i<n;i++) {
			a[i].printdetail(i+1);
		}
	}
}
class Student{
	private int roll;
	private String name;
	private String address;
	private int marks;
	public int getRoll() {
		return roll;
	}
	public void printdetail(int n) {
		System.out.println("Student Id : "+n);
		System.out.print(" Roll no: "+this.roll);
		System.out.print(" Name: "+this.name);
		System.out.print(" Address : "+this.address);
		System.out.println(" Marks : "+this.marks);
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, String address, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}