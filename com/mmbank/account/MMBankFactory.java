package com.mmbank.account;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAccount getNewSavingAccount(String name,double accountBalance,boolean isSalary) {
		// TODO Auto-generated method stub
		return new MMSavingAccount(name,accountBalance,isSalary);
	}

	@Override
	public CurrentAccount getNewCurrentAccount(String accountName,double accountBalance,double creditLimit) {
		// TODO Auto-generated method stub
		return new MMCurrentAccount(accountName, accountBalance, creditLimit);
	}

}
