package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.repository.EmployeeRepositoryInterface;

@Service
@Scope("prototype")
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	private EmployeeRepositoryInterface employeeRepositoryInterface;

	public EmployeeService() {
	}

	@Override
	public boolean addNewEmployee(Employee employee) {
		return employeeRepositoryInterface.addNewEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepositoryInterface.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		return employeeRepositoryInterface.deleteEmployee(employeeId);
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		return employeeRepositoryInterface.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepositoryInterface.getAllEmployees();
	}

}
