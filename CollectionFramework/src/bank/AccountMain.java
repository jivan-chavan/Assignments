package bank;

public class AccountMain {

	public static void main(String[] args) {


		AccountOperation accountOperation= new AccountOperation();
		
		Account account1= new Account(101,"SBI001","Jivan",1000);
		accountOperation.createAccount(account1);
		accountOperation.checkBalance(101);
		accountOperation.deposit(101, 2000);
		accountOperation.checkBalance(101);
		accountOperation.withdraw(101, 500);
		accountOperation.checkBalance(101);

		Account account2 = new Account(102, "ICICI002", "Aditi", 1500);
		Account account3 = new Account(103, "HDFC003", "Sandip", 2000);
		Account account4 = new Account(104, "BOB004", "Ayush", 1200);
		Account account5 = new Account(105, "AXIS005", "Nitin", 1800);
		accountOperation.createAccount(account2);
		accountOperation.createAccount(account3);
		accountOperation.createAccount(account4);
		accountOperation.createAccount(account5);

		accountOperation.allAccounts();
	}

}
