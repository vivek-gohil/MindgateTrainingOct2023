package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.domain.Savings;

public class BankingApplicationMainV5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter account number");
		int accountNumber = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Enter name");
		String name = scanner.next();

		System.out.println("Enter balance");
		double balance = scanner.nextDouble();
		
		System.out.println("What type of account Savings(False) OR Salary(True)");
		boolean isSalary = scanner.nextBoolean();
		
		Savings savings = new Savings(accountNumber, name, balance, isSalary);
		
		System.out.println("Enter amount to withdraw");
		double amount = scanner.nextDouble();
		
		boolean result = savings.withdraw(amount);
		System.out.println(result);
		
	}

}








