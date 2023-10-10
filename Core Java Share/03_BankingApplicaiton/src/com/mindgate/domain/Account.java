package com.mindgate.domain;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			return true;
		}
		return false;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			return true;
		}
		return false;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
}
