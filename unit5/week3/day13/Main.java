package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
	public static void printList(List<Integer> list, Predicate<Integer> predicate) {
		for(int i=0;i<list.size();i++) {
			if(predicate.test(list.get(i)))
				System.out.println(list.get(i));
		}
	}

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Random random = new Random();   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of random number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			list.add(random.nextInt(100));
		}
		Predicate<Integer> p1=s->s%2==0;
		Predicate<Integer> p2=s->s>9;
		Predicate<Integer> p3=s->true;
		while(true) {
			System.out.println("You need to print\r\n1. Only Even Number\r\n2. Number greater than 9\r\n3. Print all number");
			int in=sc.nextInt();
			if(in==1) {
				printList(list,p1);
				break;
			}
			else if(in==2) {
				printList(list,p2);
				break;
			}
			else if(in==3) {
				printList(list,p3);
				break;
			}
			else {
				System.out.println("Try again");
			}
		}
		
	}
}
