package com.masai;

public class Students {
	private int rollNo;
	private String name;
	private int marks;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Students(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	} 
}
