package bank;

import java.util.ArrayList;
import java.util.List;

public class AccountOperation {

	List<Account> list = new ArrayList<>();
	
	public void createAccount(Account account) {
		list.add(account);
	}
	public void deposit(long accountNumber,long amount) {
		boolean flag =false;
		if(!list.isEmpty()) {
			for (Account account : list) {
				if(account.getAccountNumber()==accountNumber) {
					account.setBalance(account.getBalance()+amount);
					System.out.println(amount+" Amount is deposited successfully");
					flag=true;
					break;
				}
				
			}
			if(!flag) {
				System.out.println("Enter valid account number");
			}
		}
		else {
			System.out.println("No such account");
		}
	}
	
	public void checkBalance(long accountNumber) {
		boolean flag =false;
		if(!list.isEmpty()) {
			for (Account account : list) {
				if(account.getAccountNumber()==accountNumber) {

					System.out.println("The Balance in account is = "+account.getBalance());
					flag=true;
					break;
				}
				
			}
			if(!flag) {
				System.out.println("Enter valid account number");
			}
		}
		else {
			System.out.println("No such account");
		}	
	}
	
	public void withdraw(long accountNumber,long amount) {
		boolean flag =false;
		if(!list.isEmpty()) {
			for (Account account : list) {
				if(account.getAccountNumber()==accountNumber && account.getBalance()>=amount) {					
					account.setBalance(account.getBalance()-amount);
					System.out.println(amount+" Amount is withdrawn successfully");
					flag=true;
					break;
				}else if(account.getBalance()<amount){
					System.out.println("Insufficient Balance");
					flag=true;
					break;
				}
				
			}
			if(!flag) {
				System.out.println("Enter valid account number");
			}
		}
		else {
			System.out.println("No such account");
		}
	}
	public void allAccounts() {
		if(!list.isEmpty()) {
			for (Account account : list) {
				System.out.println(account);
			}
	
		}
		else {
			System.out.println("no accounts");
		}
	}
	
}
