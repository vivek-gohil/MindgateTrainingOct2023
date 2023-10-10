package com.mindgate.main;

import java.util.Scanner;

public class HelloWorldMain {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		String message = "Mindgate Java Training";
		System.out.println(message);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your message");
		message = scanner.nextLine();
		System.out.println("Message entered :: " + message);
	}

}
