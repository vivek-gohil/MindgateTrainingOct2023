package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.domain.Account;
import com.mindgate.domain.Current;
import com.mindgate.factory.AccountFactory;

public class BankingApplicationMainV7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Account Menu");
		System.out.println("1. Savings");
		System.out.println("2. Current");
		System.out.println("Enter account choice");
		int accountChoice = scanner.nextInt();

		Account account = null;
		AccountFactory accountFactory = new AccountFactory();

		System.out.println("Enter account opening details");
		System.out.println("Enter account number");
		int accountNumber = scanner.nextInt();
		System.out.println("Enter name");
		String name = scanner.next();
		System.out.println("Enter Balance");
		double balance = scanner.nextDouble();

		switch (accountChoice) {
		case 1:
			System.out.println("Do you want to open salary account true-false");
			boolean isSalary = scanner.nextBoolean();
			account = accountFactory.getAccountObject(accountChoice, accountNumber, name, balance, isSalary, 0);
			System.out.println("Account opened successfully!!");
			break;
		case 2:
			System.out.println("Enter overdraft balance");
			double overdraftBalance = scanner.nextDouble();
			account = accountFactory.getAccountObject(accountChoice, accountNumber, name, balance, false,
					overdraftBalance);
			System.out.println("Account opened successfully!!");
			break;

		default:
			System.out.println("Invalid Account Choice");
			break;
		}

		String continueChoice = "no";
		do {
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter withdraw amount");
				double withdrawAmount = scanner.nextDouble();
				boolean status = account.withdraw(withdrawAmount);
				if (status) {
					System.out.println("Transaction successfull!");
					System.out.println("Balance :: " + account.getBalance());
				} else {
					System.out.println("Transaction failed!");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;
			case 2:
				System.out.println("Enter deposit amount");
				double depositAmount = scanner.nextDouble();
				status = account.deposit(depositAmount);
				if (status) {
					System.out.println("Transaction successfull!");
					System.out.println("Balance :: " + account.getBalance());
				} else {
					System.out.println("Transaction failed!");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;
			case 3:
				System.out.println("Balance :: " + account.getBalance());
				if (account instanceof Current) {
					Current current = (Current) account;
					System.out.println("Overdraft Balance = " + current.getOverdraftBalance());
				}
				break;
			default:
				System.out.println("Invalid Choice!");
				break;
			}
			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));

	}

}
