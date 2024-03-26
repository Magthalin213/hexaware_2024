package com.dto;

public class BankDto {
	private int customerId;
	private String accountNumber;
	private String firstName;
	private String lastName;
	private String accountType;
	private float accountBalance;
	public BankDto() {}
	public BankDto(int customerId, String accountNumber, String firstName, String lastName,
			String accountType, float accountBalance) {
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	@Override
	public String toString() {
		return "BankDto [customerId=" + customerId + ", accountNumber=" + accountNumber + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", accountType=" + accountType + ", accountBalance=" + accountBalance
				+ "]";
	}
	
}
