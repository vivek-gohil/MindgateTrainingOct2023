package com.mindgate.main;

import com.mindgate.domain.Employee;
import com.mindgate.exception.InvalidEmployeeSalaryException;

public class EmployeeMain {
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			Employee employee = new Employee(101, "Vivek", 100);
			System.out.println(employee);
		} catch (InvalidEmployeeSalaryException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main end");
	}
}
