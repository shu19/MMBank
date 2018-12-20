package com.mmbank.account;

public abstract class BankAccount {

	private final int accountNumber; 
	private String accountName;
	private double accountBalance;

	
	private static int highestAccountId;
	
	//Here initial account id is initialized
	static{
		highestAccountId=100;
	}

	//Whenever new object is created accountNumber is generated usding highestAccountId 
	{
		accountNumber=++highestAccountId;
	}
	
	public BankAccount(String accountName,double accountBalance) {
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	
	public abstract void withdraw(double amount) throws Exception;

	public void deposit(double amount) {
		this.accountBalance+=amount;
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
