package com.masai;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Employee> employee=new TreeSet<Employee>(new Employee());
		while(employee.size()<4) {
			System.out.println("Employee Id");
			int Id=sc.nextInt();
			System.out.println("Employee name");
			String Name=sc.next();
			System.out.println("Employee salary");
			double salary = sc.nextDouble();
			Employee e=new Employee(Id, Name, salary);
			employee.add(e);
		}
		for(Employee i:employee) {
			System.out.println(i);
		}
	}
}
