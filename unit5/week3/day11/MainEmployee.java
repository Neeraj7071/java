package com.masai;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Employee> Employee=new TreeSet<Employee>(new Employee());
		boolean check=true;
		while(check) {
			System.out.println("Employee Id");
			int Id=sc.nextInt();
			System.out.println("Employee name");
			String Name=sc.next();
			System.out.println("Employee salary");
			double salary = sc.nextDouble();
			Employee e=new Employee(Id, Name, salary);
			Employee.add(e);
			System.out.println("enter y if u want to exit and any key");
			String ans=sc.next();
			if(ans.charAt(0)=='y')
				check=false;
		}
		for(Employee i:Employee) {
			System.out.println(i);
		}
	}
}
