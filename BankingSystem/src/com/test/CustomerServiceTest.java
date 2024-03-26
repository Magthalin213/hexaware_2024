package com.test;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import com.service.CustomerService;

public class CustomerServiceTest {
	CustomerService cs = new CustomerService();
	
	@Test
	public void accountBalanceCheck()
	{
		String acnum="ACC333444555";
		try {
			cs.getAccountBalance(acnum);
		} catch (SQLException e) {
			Assert.assertEquals("Account Number not found".toLowerCase(), e.getMessage());
		}
		
		acnum="ACC123456789";
		try {
			cs.getAccountBalance(acnum);
		} catch (SQLException e) {
			Assert.assertEquals("Account Number not found".toLowerCase(), e.getMessage());
		}
	}
	
	
	public void accountAllDetails()
	{
		String accNumber="ACC333444555";
		try {
			cs.getAccountDetails(accNumber);
		} catch (SQLException e) {
			Assert.assertEquals("Account Number not found".toLowerCase(), e.getMessage());
		}
		
		accNumber="ACC123456789";
		try {
			cs.getAccountDetails(accNumber);
		} catch (SQLException e) {
			Assert.assertEquals("Account Number not found".toLowerCase(), e.getMessage());
		}
	}
}
