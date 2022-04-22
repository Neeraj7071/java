package com.masai;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class EmployeeBonus {
	public static void main(String args[]) throws InvalidAge {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter joining Date in dd-MM-yyyy pattern");
		String input= sc.next();
		try {
			LocalDate dob;
			try {
				DateTimeFormatter formdate=DateTimeFormatter.ofPattern("dd-MM-yyyy");
				dob = LocalDate.parse(input,formdate);  
				
			} catch (Exception ee) {
				throw new InvalidAge("Please pass the date in the correct format");
			}
			LocalDate curDate=LocalDate.now();
			long years = ChronoUnit.YEARS.between(dob, curDate);
			if(years<0)
				throw new InvalidAge("Age should not be in the future");
			else {
				int bonus;
				if(years<1)
					bonus=5000;
				else if(years>=1 && years<=2)
					bonus=8000;
				else
					bonus=10000;
				
				System.out.println("Your bonus is "+bonus);
			}
		}
		catch (Exception e){
		System.out.println(e);
		}
	}

}
