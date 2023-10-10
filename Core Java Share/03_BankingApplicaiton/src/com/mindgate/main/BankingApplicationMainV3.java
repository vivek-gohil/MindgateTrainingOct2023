package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.domain.Account;

public class BankingApplicationMainV3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter account number");
		int accountNumber = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Enter name");
		String name = scanner.next();

		System.out.println("Enter balance");
		double balance = scanner.nextDouble();

		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);
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







