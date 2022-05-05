package com.masai;

public class Student1 {
	private int empId;
	private String empName;
	private Address1 address;
	private String email;
	private String password;
	@Override
	public String toString() {
		return "Employee3 [empId=" + empId + ", empName=" + empName + ", address=" + address + ", email=" + email
				;
	}
	public Student1(int empId, String empName, Address1 address, String email, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address1 getAddress() {
		return address;
	}
	public void setAddress(Address1 address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
