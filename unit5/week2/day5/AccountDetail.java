package com.masai;

import java.util.Scanner;

public class AccountDetail {
	public void getAccountDetails(Account a) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter account id: ");
		a.setAccountId(sc.nextInt());
		System.out.print("Enter account type: ");
		a.setAccountType(sc.next());
		System.out.print("Enter balance ");
		a.setBalance(sc.nextInt());
		System.out.print("Enter amount to be withdrawn:");
		if(a.withdraw(sc.nextInt())) {
//			System.out.println("Balance amount after withdraw: "+a.getBalance());
		}
	}
	public static void main(String[] args) {
		Account a=new Account();
		
		AccountDetail ad=new AccountDetail();
		ad.getAccountDetails(a);
	}
}
class Account{
	private int accountId ;
	private String accountType ;
	private int balance ;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public boolean withdraw(int amount) {
		if(amount<this.balance) {
			int remeningBalance=this.balance-amount;
			this.setBalance(remeningBalance);
			System.out.println("Balance amount after withdraw: "+remeningBalance);
			return true;
		}
		else if(amount==this.balance) {
			System.out.println("Balance should be positive");
			return false;
		}
		else {
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
	}
	public Account() {
		
	}
	public void getAccountDetails() {
		
	}
	public Account(int accountId, String accountType, int balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}
	
}


