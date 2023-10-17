package com.mindgate.repository;

import java.util.Set;

import com.mindgate.domain.Employee;

public interface EmployeeRepositoryInterface {

	boolean addNewEmployee(Employee employee);

	Employee getEmployeeByEmployeeId(int employeeId);

	Set<Employee> getAllEmployees();

	Employee updateEmployeeSalary(int employeeId, double newSalary);

	boolean deleteEmployeeByEmployeeId(int employeeId);
}
