package com.bankingsystem.main;

public class SavingsAccount extends BankAccount{

	

	private double interestRate;
	
	
	public SavingsAccount(String accountNumber, String accountHolderName, double balance, double   interestRate) {
	
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
		System.out.println("Welcome to Saving Account ...!!!");
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
		double minimumBalance=1000;
		if((balance) >= minimumBalance) {
			balance=balance-amount;
			System.out.println("Withdrawal of amount = "+amount +" is successful..!!!");
		}else {
			System.out.println(" Sorry withdrawal is failed...!!! because You have less balance than minimum Balance..!!!");
		}
	}


}
