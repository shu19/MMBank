package com.mmbank.account;

public abstract class BankFactory {

	public abstract SavingAccount getNewSavingAccount(String name,double accountBalance,boolean isSalary);
//AccNo, accNm, accBal, creditLimit
	public abstract CurrentAccount getNewCurrentAccount(String accountName,double accountBalance,double creditLimit) ;

	
	
}
