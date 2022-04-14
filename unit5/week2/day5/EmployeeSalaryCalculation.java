package com.masai;

import java.util.Scanner;

public class EmployeeSalaryCalculation {
	public static void main(String[] arge) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Id : ");
			int id=sc.nextInt();
			System.out.print("Enter Name : ");
			String name=sc.next();
			System.out.print("Enter Salary : ");
			double salary=sc.nextDouble();
			System.out.print("Enter PF percentage : ");
			int  pf=sc.nextInt();
			Employee e1=new Employee(id,name,salary);
			e1.calculateNetSalary(pf);
			e1.printall();
		}
	}
}
class Employee{
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	public void setId(int id) {
		this.employeeId=id;
	}
	public int getId() {
		return this.employeeId;
	}
	public void setName(String name) {
		this.employeeName=name;
	}
	public String getName() {
		return this.employeeName;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary=netSalary;
	}
	public double getNetSalary() {
		return this.netSalary;
	}
	public void calculateNetSalary(int pfpercentage) {
		this.setNetSalary(this.getSalary()-pfpercentage);
	}
	
	public  int getPFPercentage() {
		return (int)(this.getSalary()-this.getNetSalary());
	}
	public  Employee(int employeeId,String employeeName,double salary ) {
		this.setId(employeeId);
		this.setName(employeeName);
		this.setSalary(salary);
	}
	public void printall() {
		System.out.println("Id : "+this.employeeId);
		System.out.println("Name : "+this.employeeName);
		System.out.println("Salary : "+this.salary);
		System.out.println("Net Salary : "+this.netSalary);
	}
}
