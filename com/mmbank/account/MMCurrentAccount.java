package com.mmbank.account;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MMCurrentAccount extends CurrentAccount {

	Logger logger= Logger.getLogger(MMCurrentAccount.class);
		
	/**
	 * @param accountName
	 * @param accountBalance
	 * @param creditLimit
	 */
	public MMCurrentAccount(String accountName, double accountBalance,
			double creditLimit) {
		super(accountName, accountBalance, creditLimit);
		
	}

	@Override
	public void withdraw(double amount) throws Exception {
		BasicConfigurator.configure();
		logger.debug("In Withdrawl Method");
		if(amount<(super.getAccountBalance()+super.getCreditLimit()) ){
			super.deposit(-amount);
			logger.info("withdrawl success");
		}else{
			logger.error("Insufficient Funds !!!");
			throw new Exception("Insufficient Funds !!!");			
		}
	}

	@Override
	public String toString() {
		logger.debug("In toString Method");
		
		return "CurrentAccount = [ " + super.toString() + "]";
	}
	
}
