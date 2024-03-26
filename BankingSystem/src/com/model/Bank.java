package com.model;

public class Bank {
	private int customerId;
	private String accountNumber;
	private String accountType;
	private float accountBalance;
	
	public Bank() {}
	
	public Bank(String accountNumber, String accountType, float accountBalance) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public Bank( int customer,String accountNumber, String accountType, float accountBalance) {
		super();
		this.customerId = customer;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Account [customerId=" + customerId + ", accountNumber=" + accountNumber + ", accountType=" + accountType
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	
}
