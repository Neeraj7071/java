package com.masai;
import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		System.out.println("start of main..");
		Scanner sc = new Scanner(System.in);
		try {
			int num1,num2;
			try {
				System.out.println("Enter num1");
				num1 = sc.nextInt();
				System.out.println("Enter num2");
				num2 = sc.nextInt();
			} catch (Exception e) {
				throw new MainException("Please enter the valid number");
			}
			if(num2==0)
				throw new MainException("num2 should not be 0");
			String message = null;
			int num3 = num1 / num2;
			if(num3 > 10){
				message = "Welcome to Exception Handling ";
			}
			else
				throw new MainException("String value is null");
			System.out.println("Message is :"+message.toUpperCase());
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("end of main");			
		}
	}
}
