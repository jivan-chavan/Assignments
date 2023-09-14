package com.test.antivirus;

public class Transaction {

	 private boolean isTransactionDone;

	    public Transaction(boolean isTransactionDone) {
	        this.isTransactionDone = isTransactionDone;
	    }
	    
	    public boolean transactionStatus() {
	    	return this.isTransactionDone;
	    }

	    public boolean makeTransaction() {
	    	
	    	this.isTransactionDone=true;
	        return this.isTransactionDone;
	    }
}
