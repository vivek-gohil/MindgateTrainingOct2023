package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.domain.Account;

public class BankingApplicationMainV2 {

	public static void main(String[] args) {
		System.out.println("main start");

		// accept account number , name , balance from user
		// using scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter account number");
		int accountNumber = scanner.nextInt();
		
		//scanner.nextLine();
		
		System.out.println("Enter name");
		String name = scanner.next();

		System.out.println("Enter balance");
		double balance = scanner.nextDouble();

		// create account class object and set accountNumber , name , balance
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);


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
		System.out.println("main end");
	}

}
