package com.masai;

import javax.naming.InsufficientResourcesException;

public class Account {
	private String accountNumber;
	private int balance;
	public void deposit(int amount) {
		this.balance=this.balance+amount;
	}
	public double  withdraw(int amount) throws  InsufficientFundException{
		if(this.balance<amount) {
			throw new InsufficientFundException("Withdraw ammount greater than your balance");
		}
		this.balance=this.balance-amount;
		return this.balance;
	}
	public Account(String accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
