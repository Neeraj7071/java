package com.masai1;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Employee Id");
	int id=sc.nextInt();
	System.out.println("Employee Name");
	String name=sc.next();
	System.out.println("Enter p/t/(any key) if permanent/temporary/unemployee ");
	String choise=sc.next();
	if(choise.matches("p")) {
		System.out.println("Enter basic pay");
		double basicpay=sc.nextDouble();
		PermanentEmployee em=new PermanentEmployee(id,name,basicpay);
		Loan l1=new Loan();
		System.out.println(l1.calculateLoanAmount(em));
	}
	else if(choise.matches("t")) {
		System.out.println("Enter the hoursWorked ");
		int hoursWorked =sc.nextInt();
		System.out.println("Enter the hourlyWages ");
		int hourlyWages=sc.nextInt();
		TemporaryEmployee em=new  TemporaryEmployee(id ,name,hoursWorked,hourlyWages);
		Loan l1=new Loan();
		System.out.println(l1.calculateLoanAmount(em));
	}
	else {
		System.out.println("you are not eligibil for loan");
	}
	
	
}
}

class Loan {
	public double calculateLoanAmount(Employee employeeObj) {
		boolean res=employeeObj.permanent;
		if(res) {
			
			return employeeObj.salary*0.15;
		}
		else {
			
			return  employeeObj.salary*0.10;
		}
	}
	
}
class Employee {
	boolean permanent;
	int employeeId;
	String employeeName;
	double salary;
	
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
class PermanentEmployee extends Employee {
	 private double basicPay;
	 boolean permanent=true;
	public PermanentEmployee(int employeeId, String employeeName,  double basicPay) {
		super(employeeId, employeeName, basicPay-(basicPay*0.12));
		this.basicPay = basicPay;
	}
	
}
class TemporaryEmployee extends Employee {
	 private int hoursWorked;
	 private int hourlyWages;
	 boolean permanent=false;
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName, hoursWorked * hourlyWages
);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}
	 
}