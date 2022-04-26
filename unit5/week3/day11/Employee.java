package com.masai;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	private int empId;
	private String empName;
	private double salary;
	
	@Override
	public String toString() {
		return "Employee [empId=" + this.empId + ", empName=" + this.empName + ", salary=" + this.salary + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmpId()>o2.getEmpId())
			return 1;
		else if(o1.getEmpId()<o2.getEmpId())
			return -1;
		else
			return 0;
	}
	
}
