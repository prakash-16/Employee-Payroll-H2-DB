package com.bridgelabz.employeepayrollh2db.models;

import javax.validation.constraints.Min;

import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.ToString;



public @Data class EmployeePayrollDTO {
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee name Invalid")
	public String name;
	@Min(value = 3000, message = "Minimum wage should be greater than 3000/-")
	public long salary;
	public String gender;
	public EmployeePayrollDTO(String name, long salary, String gender) {
		super();
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

}
