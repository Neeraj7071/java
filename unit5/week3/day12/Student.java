package com.masai;


public class Student implements Comparable<Student>{
	private int roll;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [roll=" + this.roll + ", name=" + this.name + ", marks=" + this.marks + "]";
	}
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	private int marks;

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (int)(this.getMarks() - o.getMarks());
	}

}
