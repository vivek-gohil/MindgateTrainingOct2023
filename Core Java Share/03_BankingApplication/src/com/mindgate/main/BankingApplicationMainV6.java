package com.mindgate.main;

import com.mindgate.domain.Current;

public class BankingApplicationMainV6 {

	public static void main(String[] args) {
		Current current = new Current(101, "Test", 10000, 50000);

		System.out.println("Account number = " + current.getAccountNumber());
		System.out.println("Name = " + current.getName());
		System.out.println("Balance = " + current.getBalance());
		System.out.println("OverdraftBalance = " + current.getOverdraftBalance());
		
		System.out.println();
		System.out.println("withdraw = 5000");
		current.withdraw(5000);
		System.out.println("Balance = " + current.getBalance()); // 5000
		System.out.println("OverdraftBalance = " + current.getOverdraftBalance()); // 50000
		
		System.out.println();
		System.out.println("withdraw = 15000");
		current.withdraw(15000);
		System.out.println("Balance = " + current.getBalance()); // 0
		System.out.println("OverdraftBalance = " + current.getOverdraftBalance()); // 40000
		
		System.out.println();
		System.out.println("withdraw = 5000");
		current.withdraw(5000);
		System.out.println("Balance = " + current.getBalance()); // 0
		System.out.println("OverdraftBalance = " + current.getOverdraftBalance()); // 35000
		
		System.out.println();
		System.out.println("deposit = 5000");
		current.deposit(5000);
		System.out.println("Balance = " + current.getBalance()); // 0
		System.out.println("OverdraftBalance = " + current.getOverdraftBalance()); // 40000
		
		System.out.println();
		System.out.println("deposit = 20000");
		current.deposit(20000);
		System.out.println("Balance = " + current.getBalance()); // 10000
		System.out.println("OverdraftBalance = " + current.getOverdraftBalance()); // 50000
		
		System.out.println();
		System.out.println("deposit = 5000");
		current.deposit(5000);
		System.out.println("Balance = " + current.getBalance()); // 15000
		System.out.println("OverdraftBalance = " + current.getOverdraftBalance()); // 50000
		
	}

}


