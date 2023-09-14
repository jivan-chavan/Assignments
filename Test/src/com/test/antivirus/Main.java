package com.test.antivirus;

public class Main {
	public static void main(String[] args) {

		Transaction successfulTransaction = new Transaction(true);

		
		  Antivirus freeAntivirus = new Antivirus();
		 

		Antivirus paidAntivirus = new Antivirus(successfulTransaction, "ABC12345");

	}
}
