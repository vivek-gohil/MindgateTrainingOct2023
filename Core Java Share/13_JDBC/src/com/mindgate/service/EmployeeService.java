package com.mindgate.service;

import java.util.List;
import java.util.Set;

import com.mindgate.domain.Employee;
import com.mindgate.repository.EmployeeRepository;
import com.mindgate.repository.EmployeeRepositoryInterface;

public class EmployeeService implements EmployeeServiceInterface {

	private EmployeeRepositoryInterface employeeRepositoryInterface = new EmployeeRepository();

	@Override
	public boolean addNewEmployee(Employee employee) {
		return employeeRepositoryInterface.addNewEmployee(employee);
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		return employeeRepositoryInterface.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public Set<Employee> getAllEmployees() {
		return employeeRepositoryInterface.getAllEmployees();
	}

	@Override
	public Employee updateEmployeeSalary(int employeeId, double newSalary) {
		return employeeRepositoryInterface.updateEmployeeSalary(employeeId, newSalary);
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		return employeeRepositoryInterface.deleteEmployeeByEmployeeId(employeeId);
	}

}
