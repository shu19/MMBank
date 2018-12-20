package com.mmbank.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mmbank.account.CurrentAccount;
import com.mmbank.account.MMCurrentAccount;

public class MMCurrentAccountTest {

	@Test
	public void test() {
		CurrentAccount currentAccount=new MMCurrentAccount("Shubham", 2000, 500);
		try {
			currentAccount.withdraw(2200);			
			System.out.println(currentAccount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Test 
	public void teset() {
		CurrentAccount currentAccount=new MMCurrentAccount("Shubham", 2000, 500);
		try {
			currentAccount.withdraw(2200);			
			System.out.println(currentAccount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
