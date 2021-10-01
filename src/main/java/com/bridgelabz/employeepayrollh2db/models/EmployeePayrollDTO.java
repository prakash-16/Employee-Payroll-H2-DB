package com.bridgelabz.employeepayrollh2db.models;

import javax.validation.constraints.Min;

import javax.validation.constraints.Pattern;

import lombok.Data;

public @Data class EmployeePayrollDTO {
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee name Invalid")
	public String name;
	@Min(value = 3000, message = "Minimum wage should be greater than 3000/-")
	public long salary;

	public EmployeePayrollDTO(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}
