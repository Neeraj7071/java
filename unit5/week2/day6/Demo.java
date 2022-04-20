package com.masai;

import java.util.Scanner;

public class Demo {
	public static Bank getBank(String bank) {
		Scanner sc=new Scanner(System.in);
		if(bank.equals("axis")){
			System.out.println("Enter Branch Neme");
			String bName=sc.next();
			System.out.println("Enter Ifsc Code");
			String ifscCode=sc.next();
			System.out.println("Enter Rate if interest");
			double rOT=sc.nextDouble();
			return new AxisBank(bName, ifscCode, rOT);
		}
		else if(bank.equals("icici")){
			System.out.println("Enter Branch Neme");
			String bName=sc.next();
			System.out.println("Enter Ifsc Code");
			String ifscCode=sc.next();
			System.out.println("Enter Rate if interest");
			double rOT=sc.nextDouble();
			return new ICICIBank(bName, ifscCode, rOT);
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bank name axis/icici");
		String bank=sc.next();
		Bank b1=Demo.getBank(bank);
		if(b1!=null) {
			b1.displayDetails();
			if(b1 instanceof AxisBank) {
				AxisBank a1=(AxisBank)b1;
				a1.getCreditCard();
			}
		}
	}
}
