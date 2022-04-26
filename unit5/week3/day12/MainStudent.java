package com.masai;

import java.util.*;

public class MainStudent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<String,Student> students=new HashMap<String,Student>(); 
		boolean check=true;
		while(check) {
			System.out.println("Student roll");
			int roll=sc.nextInt();
			System.out.println("student name");
			String name=sc.next();
			System.out.println("student marks");
			int marks = sc.nextInt();
			System.out.println("Enter Indian -state name");
			String stateName=sc.next();
			Student s=new Student(roll, stateName, marks);
			students.put(stateName,s);
			System.out.println("enter y if u want to exit and any key");
			String ans=sc.next();
			if(ans.charAt(0)=='y')
				check=false;
		}
		students.entrySet()
		  .stream()
		  .sorted(Map.Entry.comparingByValue((o1, o2) ->{
			  if(o1.getMarks()>o2.getMarks())
					return -1;
				else if(o1.getMarks()<o2.getMarks())
					return 1;
				else
					return 0;
		  }))
		  .forEach(System.out::println);
	}
}
