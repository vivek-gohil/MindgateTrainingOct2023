package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.domain.Employee;

public class ArrayMain {
	public static void main(String[] args) {
		System.out.println("main start");

		Employee employee = new Employee(101, "Thiru", 1000);

		System.out.println(employee);

		System.out.println("main end");
	}
}
