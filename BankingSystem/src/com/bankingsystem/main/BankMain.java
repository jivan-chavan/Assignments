package com.bankingsystem.main;

public class BankMain {
public static void main(String[] args) {
	BankAccount sa= new SavingsAccount("SA101", "Jivan", 50000, 7);
	sa.getAccountNumber();
	sa.getAccountHolderName();
	sa.getBalance();
	sa.deposit(10000);
	sa.getBalance();
	sa.withdraw(20000);
	sa.getBalance();
	
	BankAccount ca= new CheckingAccount("CA102", "Sandip", 10000, 50000);
	ca.getAccountNumber();
	ca.getAccountHolderName();
	ca.getBalance();
	ca.deposit(20000);
	ca.getBalance();
	ca.withdraw(70000);
	ca.getBalance();
}
}
