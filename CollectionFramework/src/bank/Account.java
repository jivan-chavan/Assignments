package bank;

public class Account {

	private long accountNumber;
	private String ifscCode;
	private String customerName;
	private double balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(long accountNumber, String ifscCode, String customerName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.customerName = customerName;
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", customerName=" + customerName
				+ ", balance=" + balance + "]";
	}
	
	

}
