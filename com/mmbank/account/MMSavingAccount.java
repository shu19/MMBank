package com.mmbank.account;

public class MMSavingAccount extends SavingAccount {

	public MMSavingAccount(String accountName, double accountBalance, boolean isSalaried) {
		super(accountName,accountBalance,isSalaried);
	}

	@Override
	public void withdraw(double amount) throws Exception {
		
		if (amount<=super.getAccountBalance()) {
			super.deposit(-amount);
		}
		else {
			throw new Exception("Insufficient Funds");
		}
		
	}

}
