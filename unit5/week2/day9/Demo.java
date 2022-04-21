package com.masai;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abbbabbaba");
		System.out.println("Enter the username");
		String userName=sc.next();
		while(!Pattern.matches("[a-z]{3,8}", userName)) {
			System.out.println("Enter again username");
			userName=sc.next();
		}
		System.out.println("Enter the Password");
		String password=sc.next();
		while(!Pattern.matches("[a-zA-Z0-9]{3,8}", password)) {
			System.out.println("Enter again  password");
			password=sc.next();
		}
		System.out.println("Enter the mobile Number");
		String mobile=sc.next();
		while(!Pattern.matches("[6789]{1}[0-9]{9}", mobile)) {
			System.out.println("Enter again mobile Number ");
			mobile=sc.next();
		}
		System.out.println("Enter the email");
		String email=sc.next();
		while(!Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email)) {
			System.out.println("Enter again email ");
			email=sc.next();
		}
		CustomerBean c1=new CustomerBean(userName, password, mobile, email);
	}
}
