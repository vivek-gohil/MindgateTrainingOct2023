package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.util.Calculations;

public class CalculationsMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number 1");
		int number1 = scanner.nextInt();
		System.out.println("Enter number 2");
		int number2 = scanner.nextInt();

		Calculations calculations = new Calculations();
		int additionResult = calculations.addition(number1, number2);
		System.out.println("Addition :: " + additionResult);

		System.out.println("+++++++++++++++++++++++++++++++++++");

		int subtractionResult = calculations.subtraction(number1, number2);
		System.out.println("Subtraction :: " + subtractionResult);

		System.out.println("+++++++++++++++++++++++++++++++++++");

		int multiplicationResult = calculations.multiplication(number1, number2);
		System.out.println("Multiplication :: " + multiplicationResult);
		System.out.println("+++++++++++++++++++++++++++++++++++");

		int divisionResult = calculations.division(number1, number2);
		System.out.println("Division :: " + divisionResult);

	}
}
