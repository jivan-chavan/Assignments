package com.bankingsystem.main;

public class CheckingAccount extends BankAccount {

	private double overdraftLimit;
	
	/*
	 * public CheckingAccount(String accountNumber, String accountHolderName, double
	 * balance) { super(accountNumber, accountHolderName, balance); }
	 */
	public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
		super(accountNumber, accountHolderName, balance);
		this.overdraftLimit = overdraftLimit;
		System.out.println("Welcome to Checking Account ...!!!");

	}

	@Override
	public void getAccountNumber() {
System.out.println("Account Number : "+accountNumber);		
	}

	@Override
	public void getAccountHolderName() {
		System.out.println("Account Holder Name : "+accountHolderName);
		
	}

	@Override
	public void getBalance() {
		System.out.println("Your Account Balance is: "+balance);
	}

	@Override
	public void deposit(double amount) {
		balance=balance+amount;
System.out.println("you have succesfully deposited the amount = "+amount);		
	}

	@Override
	public void withdraw(double amount) {
		if(amount <= (balance+overdraftLimit)) {
			balance=balance-amount;
			System.out.println("This is an Overdaraft. Withdrawal of amount = "+amount +" is successful..!!!");
		}else {
			System.out.println(" Sorry withdrawal is failed...!!! because Your requested amount is more than overdraft limit..!!!");
		}
		
	}

	
}
