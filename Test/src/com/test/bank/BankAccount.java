package com.test.bank;

public class BankAccount {

	private long accountNumber;
	private int balance;
	private String ownerName;
	
	public BankAccount() {
		
			}
	
	public BankAccount(long accountNumber, int balance, String ownerName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void deposit(int amount) {
		this.balance=this.balance+amount;
		System.out.println("The amount ="+amount +" is deposited ...!!! "
				+ "into account of account number "+getAccountNumber()+ " of owner "+
				getOwnerName());
	}
	public void withdraw(int amount) {
		this.balance=this.balance - amount;
		System.out.println("The amount ="+amount +" is withdraw ...!!! "
				+ "from account of account number "+getAccountNumber()+ " of owner "+
				getOwnerName());
	}
	

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount( 101,100000,"Jivan");
		ba1.deposit(10000);
		ba1.withdraw(5000);
		System.out.println("The Balance in "+ba1.getOwnerName()+"'s account is "+ba1.getBalance());
		BankAccount ba2 = new BankAccount( 102,50000,"Rajesh");
		ba2.deposit(40000);
		ba2.withdraw(20000);
		System.out.println("The Balance in "+ba2.getOwnerName()+"'s account is "+ba2.getBalance());

	}
	
	
}
