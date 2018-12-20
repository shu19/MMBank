package com.mmbank.account;

public abstract class BankAccount {

	private final int accountNumber;
	private String accountName;
	private double accountBalance;

	
	private static int highestAccountId;
	
	static{
		highestAccountId=100;
	}
	
	{
		accountNumber=++highestAccountId;
	}
	
	public BankAccount(String accountName,double accountBalance) {
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public abstract void withdraw(double amount);

	public void deposit(double amount) {

	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountName="
				+ accountName + ", accountBalance=" + accountBalance + "]";
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	

}
