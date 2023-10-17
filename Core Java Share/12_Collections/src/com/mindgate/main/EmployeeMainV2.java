package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.domain.Employee;

public class EmployeeMainV2 {

	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Test1", 1000);
		Employee employee2 = new Employee(101, "Test1", 1000);
		Employee employee3 = new Employee(102, "Test2", 1000);
		System.out.println("employee1 values");
		System.out.println(employee1);
		System.out.println(employee1.hashCode());
		System.out.println("employee2 values");
		System.out.println(employee2);
		System.out.println(employee2.hashCode());
		System.out.println("employee3 values");
		System.out.println(employee3);
		System.out.println(employee3.hashCode());

		System.out.println("+++++++++++++++++++++++++++");
		Set<Employee> employeeSet = new HashSet<Employee>();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		System.out.println("employeeSet values");
		System.out.println(employeeSet);
	}

}
