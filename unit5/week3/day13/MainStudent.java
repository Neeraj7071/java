package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		List<Students> list=new ArrayList<Students>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Student "+(i+1)+" Roll No");
			int roll=sc.nextInt();
			System.out.println("Enter Student "+(i+1)+" Name");
			String name=sc.next();
			System.out.println("Enter Student "+(i+1)+" Marks");
			int marks=sc.nextInt();
			list.add(new Students(roll, name, marks));
		}
		list.stream().filter(s->s.getMarks()<250).forEach(System.out::println);;
	}
}
