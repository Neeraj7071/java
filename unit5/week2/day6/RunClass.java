package com.masai;

import java.util.Scanner;

public class RunClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Student id");
		int id=sc.nextInt();
		System.out.println("student Name");
		String name=sc.next();
		System.out.println("ExamFee");
		double examFee=sc.nextDouble();
		System.out.println("transportFee");
		double transportFee=sc.nextDouble();
		System.out.println("HostellerFee");
		double hostelFee=sc.nextDouble();
		Student s1=new Student(id,name,examFee,transportFee,hostelFee);
		s1.displayDetails();
		System.out.println("remaining Fee"+s1.payFee());
	}
}

class Student{
	 private int studId;
	 private String StudName;
	 private double examFee;
	 DayScholar d1;
	 Hosteller h1;
	 public void displayDetails() {
		 System.out.println("Student id "+this.studId);
		 System.out.println("Student Name "+this.StudName);
		 System.out.println("Exam Fee "+this.examFee);
		 System.out.println("Transport Fee"+this.d1.getTransportFee());
		 System.out.println("Hosteller Fee"+this.h1.getHostlerFee());
	 }
	 public Student(int studId, String studName, double examFee, double transportFee ,double hostelFee) {
		super();
		this.studId = studId;
		StudName = studName;
		this.examFee = examFee;
		this.d1 = new DayScholar(transportFee);
		this.h1 = new Hosteller(hostelFee);
	}
	public double payFee() {
		 return examFee+this.d1.getTransportFee()+this.h1.getHostlerFee();
	 }
}
class DayScholar{
	private double transportFee;

	public double getTransportFee() {
		return transportFee;
	}

	public void setTransportFee(double transportFee) {
		this.transportFee = transportFee;
	}

	public DayScholar(double transportFee) {
		super();
		this.transportFee = transportFee;
	}
	
}
class Hosteller{
	private double hostlerFee;

	public Hosteller(double hostlerFee) {
		super();
		this.hostlerFee = hostlerFee;
	}

	public double getHostlerFee() {
		return hostlerFee;
	}

	public void setHostlerFee(double hostlerFee) {
		this.hostlerFee = hostlerFee;
	}

}