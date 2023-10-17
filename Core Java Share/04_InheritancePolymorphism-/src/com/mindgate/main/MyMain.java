package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.domain.A;
import com.mindgate.factory.MyFactory;

public class MyMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();

		MyFactory factory = new MyFactory();
		A a = factory.getObject(choice);
		if (a != null)
			a.show();
		else
			System.out.println("Invalid choice");
	}

}


