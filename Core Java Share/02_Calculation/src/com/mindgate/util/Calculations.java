package com.mindgate.util;

public class Calculations {

	public int addition(int number1, int number2) {
		System.out.println("Number 1 :: " + number1);
		System.out.println("Number 2 :: " + number2);

		int result = number1 + number2;

		// System.out.println("Addition :: " + result);
		return result;
	}

	public int subtraction(int number1, int number2) {
		System.out.println("Number 1 :: " + number1);
		System.out.println("Number 2 :: " + number2);

		int result = number1 - number2;

		// System.out.println("Subtraction :: " + result);
		return result;
	}

	public int multiplication(int number1, int number2) {
		System.out.println("Number 1 :: " + number1);
		System.out.println("Number 2 :: " + number2);

		int result = number1 * number2;

		// System.out.println("Multiplicaiton :: " + result);
		return result;
	}

	public int division(int number1, int number2) {
		System.out.println("Number 1 :: " + number1);
		System.out.println("Number 2 :: " + number2);

		int result = number1 / number2;

		// System.out.println("Division :: " + result);
		return result;
	}

}
