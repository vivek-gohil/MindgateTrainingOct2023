package com.mindgate.main;

import com.mindgate.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		System.out.println("main start");

		Employee employee = new Employee(101, "Mindgate", 1000);
		System.out.println(employee);
		Employee employee2 = new Employee(102, "Moorthy", 1000);
		System.out.println(employee2);
		Employee employee3 = new Employee(103, "Kirup", 1000);
		System.out.println(employee3);
		Employee employee4 = new Employee(104, "Sudarshan", 1000);
		System.out.println(employee4);
		Employee employee5 = new Employee(105, "Priyadarshani", 1000);
		System.out.println(employee5);

		Employee[] employeeArray = new Employee[5];
		employeeArray[0] = employee;
		employeeArray[1] = employee2;
		employeeArray[2] = employee3;
		employeeArray[3] = employee4;
		employeeArray[4] = employee5;

		System.out.println("++++++++++++++++++++++++");
		for (Employee e : employeeArray) {
			System.out.println(e);
		}

		System.out.println("main end");
	}
}
