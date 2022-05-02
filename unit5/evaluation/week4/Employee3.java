package com.masai1;

public class Employee3 {
	private int empId;
	private String empName;
	private Address3 address;
	private String email;
	private String password;
	@Override
	public String toString() {
		return "Employee3 [empId=" + empId + ", empName=" + empName + ", address=" + address + ", email=" + email
				+ ", password=" + password + "]";
	}
	public Employee3(int empId, String empName, Address3 address, String email, String password) {
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
	public Address3 getAddress() {
		return address;
	}
	public void setAddress(Address3 address) {
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
