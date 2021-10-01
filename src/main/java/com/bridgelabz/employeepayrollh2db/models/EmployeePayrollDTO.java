package com.bridgelabz.employeepayrollh2db.models;

import lombok.Data;

public @Data class EmployeePayrollDTO {
	private String name;
	private long salary;

	public EmployeePayrollDTO(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}
