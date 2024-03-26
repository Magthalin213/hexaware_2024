package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.BankDao;
import com.dao.BankDaoImpl;
import com.model.Bank;
import com.model.Customer;

public class BankService {
	BankDao bd=new BankDaoImpl();
	
	public void createBankAccount(int customer_id,String accNum, String type, float balance) throws SQLException {
		bd.createBankAccount(customer_id,accNum,type,balance);
	}
	public int createCustomerAccount(Customer cus) throws SQLException {
		return bd.createCustomerAccount(cus);		
	}
	public List<Bank> listAccounts() throws SQLException {
		return bd.listAccounts();
	}
	public void calculateInterest(float bal, float rate) {
		bd.calculateInterest(bal,rate);
	}

}
