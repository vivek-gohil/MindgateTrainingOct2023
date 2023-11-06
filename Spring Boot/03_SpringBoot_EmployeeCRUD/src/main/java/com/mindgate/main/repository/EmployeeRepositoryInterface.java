package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.Employee;

public interface EmployeeRepositoryInterface {
	public boolean addNewEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public boolean deleteEmployee(int employeeId);

	public Employee getEmployeeByEmployeeId(int employeeId);

	public List<Employee> getAllEmployees();
}
