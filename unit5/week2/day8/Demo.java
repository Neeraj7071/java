package com.masai;

import java.util.Scanner;

public class Demo {
	public static Hotel provideFood(int amount) {
		if(amount>1000) {
			return new TajHotel();
		}
		else if(amount>=200 && amount<1000 ) {
			return new RoadSideHotel();
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		Hotel h1=provideFood(sc.nextInt());
		if(h1!=null) {
			if(h1 instanceof TajHotel ) {
				TajHotel h2=(TajHotel)h1;
				h2.welcomeDrink();
				}
			h1.chickenBiryani();
			h1.masalaDosa();
		}
		else
			System.out.println(" Please Enter a valid amount");
	}
}
