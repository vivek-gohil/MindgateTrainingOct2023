package com.mindgate.main;

import com.mindgate.domain.Account;

public class BankingApplicationMain {

	public static void main(String[] args) {

		System.out.println("main start");

		Account account = new Account();
		account.setAccountNumber(101);
		account.setName("Akshaya");
		account.setBalance(1000);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		Account account2 = new Account();
		account2.setAccountNumber(102);
		account2.setName("Kamesh");
		account2.setBalance(1000);
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());

		System.out.println("++++++++++++++++++++++++++++++");
		
		Account account3 = new Account();
		account3.setAccountNumber(103);
		account3.setName("Kirupa");
		account3.setBalance(1000);
		System.out.println(account3.getAccountNumber());
		System.out.println(account3.getName());
		System.out.println(account3.getBalance());
		
		System.out.println("main end");

	}

}
