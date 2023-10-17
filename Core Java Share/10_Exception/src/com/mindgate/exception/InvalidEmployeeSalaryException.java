package com.mindgate.exception;

public class InvalidEmployeeSalaryException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Please give valid salary to employee! , salary > 0";
	}
}
