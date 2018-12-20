package com.mmbank.account;

public abstract class SavingAccount extends BankAccount {
	
	private boolean isSalary;

	/**
	 * @param accountName
	 * @param accountBalance
	 * @param isSalary
	 */
	public SavingAccount(String accountName, double accountBalance,
			boolean isSalary) {
		super(accountName, accountBalance);
		this.isSalary = isSalary;
	}
	
	

}
