package com.bridgelabz.employeepayrollh2db.models;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class EmployeePayrollDetails {
	private int id;
	private String name;
	private long salary;
	private String gender;
	public LocalDate start;
	public String note;
	public String profilePic;
	public List<String> department;

	public EmployeePayrollDetails(int id,String name, EmployeePayrollDTO emp) {
		super();
		this.id = id;
		this.name = emp.name;
		this.salary = emp.salary;
		this.gender = emp.gender;
		this.start = emp.start;
		this.note = emp.note;
		this.profilePic = emp.profilePic;
		this.department = emp.department;
	}

}
