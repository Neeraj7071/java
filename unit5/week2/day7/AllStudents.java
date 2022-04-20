package com.masai;

import java.util.Scanner;

public class AllStudents {
	static int noOfStudents;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Students");
		int n=sc.nextInt();
		AllStudents.noOfStudents=n;
		Student1[] s=new Student1[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter student "+(i+1)+" is Science Student then press Y and for History Student any key");
			String ans=sc.next();
			if(ans.charAt(0)=='Y') {
				System.out.println("Enter Student name");
				String name=sc.next();
				System.out.println("Enter Student address ");
				String add=sc.next();
				System.out.println("Enter physics marks");
				int phisicsMarks=sc.nextInt();
				System.out.println("Enter Chemistry Marks");
				int chemistryMarks=sc.nextInt();
				System.out.println("Enter maths Marks");
				int mathsMarks=sc.nextInt();
				s[i]=new ScienceStudent(name, add, phisicsMarks, chemistryMarks, mathsMarks);
				s[i].getPercentage();
				s[i].getTotalNoStudents();
			}
			else {
				System.out.println("Enter Student name");
				String name=sc.next();
				System.out.println("Enter Student address ");
				String add=sc.next();
				System.out.println("Enter history marks");
				int historyMarks=sc.nextInt();
				System.out.println("Enter Civics marks");
				int civicsMarks=sc.nextInt();
				s[i]=new HistoryStudent(name, add, historyMarks, civicsMarks);
				s[i].getPercentage();
				s[i].getTotalNoStudents();
			}
		}
	}
	
}
abstract class Student1{
	private String name;
	private String address;
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
	public Student1(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public abstract void getPercentage( );
	public static void getTotalNoStudents( ) {
		System.out.println("Total Number of Sudents"+AllStudents.noOfStudents);
	}

}
class ScienceStudent extends Student1{
	private int phisicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	public ScienceStudent(String name, String address, int phisicsMarks, int chemistryMarks, int mathsMarks) {
		super(name, address);
		this.phisicsMarks = phisicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}
	@Override
	public void getPercentage() {

		System.out.println("Student Percentage"+((this.chemistryMarks+this.mathsMarks+this.phisicsMarks)/3)+"% ");
	}
	public int getPhisicsMarks() {
		return phisicsMarks;
	}
	public void setPhisicsMarks(int phisicsMarks) {
		this.phisicsMarks = phisicsMarks;
	}
	public int getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	
}
class HistoryStudent extends Student1{
	private int historyMarks;
	private int civicsMarks;
	@Override
	public void getPercentage() {
		System.out.println("Student Percentage"+((this.historyMarks+this.civicsMarks)/2)+"% ");
		
	}
	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
		super(name, address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}
	public int getHistoryMarks() {
		return historyMarks;
	}
	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}
	public int getCivicsMarks() {
		return civicsMarks;
	}
	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}
	
}
