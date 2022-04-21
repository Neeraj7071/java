package com.masai;

import java.util.Scanner;

public class AverageAge {
	static void calculateAverage(int[] age) {
		double  sum=0;
		for(int i:age) {
			sum+=i;
		}
		System.out.println("The average age is "+sum/age.length);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no.of employees:");
		int n=sc.nextInt();
		if(n==1) {
			System.out.println("Please enter a valid employee count");
		}
		else {
			System.out.println("Enter the age for "+n+" employees");
			int[] age=new int[n];
			for(int i=0;i<n;i++){
				age[i]=sc.nextInt();
			}
			calculateAverage(age);
		}
	}
}
