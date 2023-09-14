package com.bankingsystem.main;

public abstract class BankAccount {
	
	public String accountNumber;
	public String accountHolderName;
	public double balance;
	
	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public abstract void getAccountNumber();
	public abstract void getAccountHolderName();
	public abstract void getBalance();
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
}
