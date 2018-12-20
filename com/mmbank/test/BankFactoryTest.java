package com.mmbank.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mmbank.account.BankFactory;
import com.mmbank.account.CurrentAccount;
import com.mmbank.account.MMBankFactory;
import com.mmbank.account.SavingAccount;

public class BankFactoryTest {

	@Test
	public void test() {
		BankFactory b=new MMBankFactory();
		SavingAccount s1=b.getNewSavingAccount("Shubham",5000,true);
		try {
			s1.withdraw(15000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Test (expected = Exception.class)
	public void testInsufficientFunds() {
		BankFactory b=new MMBankFactory();
		CurrentAccount c1=b.getNewCurrentAccount("Prashant", 6000, 5000);
		try {
			c1.withdraw(20000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RuntimeException exception=new RuntimeException();
			throw exception;

			
		}
		
	}

	
	
}
