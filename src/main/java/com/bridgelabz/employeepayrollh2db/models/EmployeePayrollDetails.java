package com.bridgelabz.employeepayrollh2db.models;

import lombok.Data;

@Data
public class EmployeePayrollDetails {
	private int id;
	private String name;
	private long salary;
	private EmployeePayrollDTO empDto;

	public EmployeePayrollDetails(int id, EmployeePayrollDTO empDto) {
		super();
		this.id = id;
		this.name = empDto.getName();
		this.salary = (long) empDto.getSalary();
	}

}
