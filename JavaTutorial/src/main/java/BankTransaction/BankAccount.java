package BankTransaction;


public class BankAccount {
	
	private static int balance=1200;
	
	public int getBalance() {
		
		return balance;
		
	}

	public int performTransaction(int transactionAmt, boolean b) {
		
		if(b) {
			
			balance=balance+transactionAmt;
			return balance;
			
		}
		else {
			if(balance>=transactionAmt) {
				balance=balance-transactionAmt;
				return balance;
			}
			else {
				return balance-transactionAmt;
				
			}
			
			
			
		}
	
		
	}

}
