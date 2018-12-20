package com.mmbank.account;

import com.mmbank.account.BankAccount;

public abstract class CurrentAccount extends BankAccount {

	private double creditLimit;
	
	/**
	 * @param accountName
	 * @param accountBalance
	 * @param creditLimit
	 */
	public CurrentAccount(String accountName, double accountBalance,
			double creditLimit) {
		super(accountName, accountBalance);
		this.creditLimit = creditLimit;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
