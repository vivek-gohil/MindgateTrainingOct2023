package com.mindgate.factory;

import com.mindgate.domain.Account;
import com.mindgate.domain.Current;
import com.mindgate.domain.Savings;

public class AccountFactory {
	public Account getAccountObject(int choice, int accountNumber, String name, double balance, boolean isSalary, double overdraftBalance) {
		if (choice == 1) {
			return new Savings(accountNumber, name, balance, isSalary);
		}
		if (choice == 2) {
			return new Current(accountNumber, name, balance, overdraftBalance);
		}
		return null;

	}
}
