package com.masai;

import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

public class AccountDemo {
	public static void main(String[] args) throws InsufficientResourcesException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number");
		String accountNumber=sc.next();
		Account a1=new Account(accountNumber, 0);
		System.out.println("Enter deposit amount");
		a1.deposit(sc.nextInt()); 
		System.out.println("Enter withdraw ammount");
		try {
			a1.withdraw(sc.nextInt());
		} catch (InsufficientFundException e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
}
