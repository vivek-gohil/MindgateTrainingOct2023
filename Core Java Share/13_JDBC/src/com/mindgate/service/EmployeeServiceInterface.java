package com.mindgate.service;

import java.util.Set;

import com.mindgate.domain.Employee;

public interface EmployeeServiceInterface {
	boolean addNewEmployee(Employee employee);

	Employee getEmployeeByEmployeeId(int employeeId);

	Set<Employee> getAllEmployees();

	Employee updateEmployeeSalary(int employeeId, double newSalary);

	boolean deleteEmployeeByEmployeeId(int employeeId);
}
