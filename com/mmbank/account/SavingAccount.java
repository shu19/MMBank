package com.mmbank.account;

public abstract class SavingAccount extends BankAccount {
	
	private boolean isSalary;

	private static final double MINBAL=1000;
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

	/**
	 * withdraw not allowed below minimum balance in the account
	 * @throws Exception 
	 */
	@Override
	public void withdraw(double amount) throws Exception {
		if(amount<(super.getAccountBalance()-MINBAL))
		super.deposit(-amount);
	}
	
	@Override
	public String toString() {
		return "SavingAccount [isSalary=" + isSalary + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
