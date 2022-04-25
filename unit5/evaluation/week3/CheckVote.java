package com.masai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class CheckVote {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your  Date of birth in dd-MM-yyyy format ");
		String input=sc.next();
			try {
				DateTimeFormatter formdate=DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate dob=LocalDate.parse(input,formdate);
				LocalDate curDate=LocalDate.now();
				long years=ChronoUnit.YEARS.between(dob, curDate);
				dob=dob.plusYears(18);
//				System.out.println(dob+" "+curDate);
//				System.out.println(curDate.compareTo(dob));
				if(curDate.compareTo(dob)==0) {
					System.out.println("Happy Birthday, You are eligible to cast your vote.");
					}
				else if(years<0) {
					System.out.println("Date of birth should not be in future");
				}
				else if(years>=18) {
					System.out.println("You are eligible to cast your vote");
				}
			} catch (Exception e) {
				System.out.println("please pass the date in the proper format”");
			}
	}
}
