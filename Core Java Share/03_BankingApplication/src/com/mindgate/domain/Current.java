package com.mindgate.domain;

public class Current extends Account {
	private double overdraftBalance;
	private double initialOverdraftBalance;

	public Current() {
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		initialOverdraftBalance = overdraftBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= getBalance()) {
			setBalance(getBalance() - amount);
			return true;
		}
		if (amount > 0 && amount > getBalance()) {
			amount = amount - getBalance();
			setBalance(0);
			overdraftBalance = overdraftBalance - amount;
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (initialOverdraftBalance == overdraftBalance) {
			setBalance(getBalance() + amount);
			return true;
		} else {
			if (amount > (initialOverdraftBalance - overdraftBalance)) {
				amount = amount - (initialOverdraftBalance - overdraftBalance);
				overdraftBalance = initialOverdraftBalance;
				setBalance(getBalance() + amount);
				return true;
			} else {
				overdraftBalance = overdraftBalance + amount;
				return true;
			}
		}
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

}
