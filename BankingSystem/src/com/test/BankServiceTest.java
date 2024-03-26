package com.test;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import com.service.BankService;

public class BankServiceTest {
	BankService bs=new BankService();
	
	@Test
	public void accountsListCheck()
	{
		try {
			bs.listAccounts();
		} catch (SQLException e) {
			Assert.assertEquals("Error in finding list of accounts in bank".toLowerCase(), e.getMessage());
		}
	}
	
	
}
