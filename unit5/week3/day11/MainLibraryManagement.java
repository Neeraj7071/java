package com.masai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainLibraryManagement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<LibraryManagement> library=new TreeSet<LibraryManagement>(new LibraryManagement());
		while(library.size()<5) {
			System.out.println("MemberId");
			int id=sc.nextInt();
			System.out.println("Membername");
			String name=sc.next();
			System.out.println("MemberShip number");
			int num = sc.nextInt();
			boolean check=true;
			LocalDate date1 = null;
			while(check) {
				System.out.println("Member Enddate in formate dd-MM-yyyy");
				String endDate=sc.next();
				try {
					DateTimeFormatter formdate=DateTimeFormatter.ofPattern("dd-MM-yyyy");
					date1=LocalDate.parse(endDate,formdate);
					check=false;
				} catch (Exception e) {
					System.out.println("Please enter valide date");
				}
			}
			LibraryManagement l=new LibraryManagement(id, name, num, date1);
			library.add(l);
			System.out.println("Total member"+library.size());
		}
		for(LibraryManagement i:library) {
			System.out.println(i);
		}
	}
}
