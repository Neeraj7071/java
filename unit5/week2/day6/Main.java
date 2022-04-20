package com.masai;

import java.util.Scanner;

public class Main {
	public static Hosteller1 getHostellerDetails(Hosteller1 h1,String phone,int roomNumber) {
		h1.setPhone(phone);
		h1.setRoomNumber(roomNumber);
			return h1;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Student Id");
		int id=sc.nextInt();
		System.out.println("Student Name");
		String name=sc.next();
		System.out.println("Department Id");
		int dId=sc.nextInt();
		System.out.println("Gender");
		String gender=sc.next();
		System.out.println("phone");
		String phone=sc.next();
		System.out.println("Hosteller Name");
		String hName=sc.next();
		System.out.println("Room no");
		int roomNumber=sc.nextInt();
		Hosteller1 h1=new Hosteller1(id, name, dId, gender, phone, hName, roomNumber);
		System.out.println("Modify Room Number(Y/N)");
		String ans1=sc.next();
		if(ans1.charAt(0)=='Y') {
			System.out.println("New Room Number");
			roomNumber=sc.nextInt();
		}
		System.out.println("Modify Phone Number(Y/N");
		String ans2=sc.next();
		if(ans2.charAt(0)=='Y') {
			System.out.println("New Phone Number");
			phone=sc.next();
		}
		Main.getHostellerDetails(h1, phone, roomNumber);
		h1.displayDetail();
	}
}
class Student1 {
	private int  studentId;
	private String name;
	private int departmentId;
	private String gender;
	private String phone;
	public Student1(int studentId, String name, int departmentId, String gender, String phone) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.departmentId = departmentId;
		this.gender = gender;
		this.phone = phone;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
class Hosteller1 extends Student1{
	private String hotelName;
	private int roomNumber;
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Hosteller1(int studentId, String name, int departmentId, String gender, String phone, String hotelName,
			int roomNumber) {
		super(studentId, name, departmentId, gender, phone);
		this.hotelName = hotelName;
		this.roomNumber = roomNumber;
	}
	public void displayDetail() {
		System.out.println("Student Details: "+this.getStudentId()+this.getName()+this.getDepartmentId()+this.getGender()+this.getPhone()+this.hotelName+this.roomNumber);
	}
	public String toString() {
	      return this.getStudentId()+" "+this.getName()+" "+this.getDepartmentId()+" "+this.getGender()+" "+this.getPhone()+" "+this.hotelName+" "+this.roomNumber;
	}
}
