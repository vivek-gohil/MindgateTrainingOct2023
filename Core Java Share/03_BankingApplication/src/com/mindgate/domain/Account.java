package com.mindgate.domain;

public abstract class Account {
	private int accountNumber;
	private String name;
	private double balance;

	public Account() {
		System.out.println("Default constrcutor of Account");
	}

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		System.out.println("Parameterized constrcutor of Account");
	}

	public abstract boolean withdraw(double amount);

	public abstract boolean deposit(double amount);

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
