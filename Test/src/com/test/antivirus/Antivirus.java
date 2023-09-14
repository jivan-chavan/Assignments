package com.test.antivirus;

public class Antivirus {

	private final String productKey;
	private boolean isActivated;

	
	
	public Antivirus() {
		this.productKey = null;
		System.out.println("You are using free version, please upgrade");	
	}

	public Antivirus(Transaction transaction, String productKey) {
		this.productKey = productKey;

		if (transaction.transactionStatus()) {
			this.isActivated = true;
			System.out.println("Antivirus activated. You are protected!");
		} else {
			System.out.println("Transaction is not done - please pay first to activate product key");
			transaction.makeTransaction();
		}

	}
	
	
	
}
