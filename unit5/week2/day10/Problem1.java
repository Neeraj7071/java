package com.masai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Problem1 {
	public static void main(String args[]) throws InvalidDateFormat {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
		String input= sc.next();
		try {
			try {
				DateTimeFormatter formdate=DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate dob = LocalDate.parse(input,formdate);  
				LocalDate curDate=LocalDate.now();
				long years = ChronoUnit.YEARS.between(dob, curDate);
				if(years<0)
					System.out.println("Age should not be in the nagative");
				else
				System.out.println("You are "+years+"Years old");
			}
			catch (Exception e){
				System.out.println(e);
				throw new InvalidDateFormat("Please pass the date in the correct format");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		

}

