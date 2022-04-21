package com.masai;

import java.util.Scanner;

public class Demo1 {
	enum Month{
		January, February, March, April, May, June, July, August, September, October, November, December;

	}
	public static void showDetails(Month m) {
		switch (m) {
		case January:
			System.out.println("This is the 1st Month of the Year January");
			break;
		case February:
			System.out.println("This is the 2nd Month of the Year February");
			break;
		case March:
			System.out.println("This is the 3rd Month of the Year March");
			break;
		case April:
			System.out.println("This is the 4rt Month of the Year April");
			break;
		case May:
			System.out.println("This is the 5th Month of the Year May");
			break;
		case June:
			System.out.println("This is the 6th Month of the Year June");
			break;
		case July:
			System.out.println("This is the 7th Month of the Year July");
			break;
		case August:
			System.out.println("This is the 8th Month of the Year August");
			break;
		case September:
			System.out.println("This is the 9th Month of the Year September");
			break;
		case October:
			System.out.println("This is the 10th Month of the Year October");
			break;
		case November:
			System.out.println("This is the 11th Month of the Year November");
			break;
		case December:
			System.out.println("This is the 12th Month of the Year December");
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the month");
		String input=sc.next();
		try {
			Month month =Month.valueOf(input);
			showDetails(month);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Month Name");
        }
	}
}
