package com.mindgate.repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mindgate.domain.Employee;

public class EmployeeRepository implements EmployeeRepositoryInterface {

	private Set<Employee> employeeSet = new HashSet<Employee>();

	@Override
	public boolean addNewEmployee(Employee employee) {
//		boolean result = employeeList.add(employee);
//		return result;
		return employeeSet.add(employee);
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeSet) {
			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public Employee updateEmployeeSalary(int employeeId, double newSalary) {
		for (Employee employee : employeeSet) {
			if (employee.getEmployeeId() == employeeId) {
				employee.setSalary(newSalary);
				return employee;
			}
		}
		return null;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeSet) {
			if (employee.getEmployeeId() == employeeId) {
				return employeeSet.remove(employee);
			}
		}
		return false;
	}

	@Override
	public Set<Employee> getAllEmployees() {
		return employeeSet;
	}
}
