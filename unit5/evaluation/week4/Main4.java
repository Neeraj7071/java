package com.masai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Student> listStudent=new ArrayList<Student>();
		while(listStudent.size()<=5) {
			System.out.println("Enter the student roll");
			int roll =sc.nextInt();
			System.out.println("Enter the student name");
			String name=sc.next();
			System.out.println("Enter the Student marks");
			int marks=sc.nextInt();
			listStudent.add(new Student(roll, name, marks));
		}
		List<Employee> listEmployee=listStudent
				.stream()
				.map(s->new Employee(s.getRoll(),s.getName(),(double)(s.getMarks()*1000)))
				.collect(Collectors.toList());
		Collections.sort(listEmployee,(Employee o1, Employee o2)-> {
					if(o1.getSalary()>o2.getSalary())
						return 1;
					else if(o1.getSalary()<o2.getSalary())
						return -1;
					else {
						if(o1.getName().compareTo(o2.getName())>0)
							return 1;
						else
							return -1;
					}
				});
		listEmployee.stream().forEach(System.out::println);
	}
	
}
