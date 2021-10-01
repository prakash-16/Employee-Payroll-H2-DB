package com.bridgelabz.employeepayrollh2db.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "payroll_service")
public @Data class EmployeePayrollData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private String name;
	private long salary;
	private String gender;
	public LocalDate start;
	public String note;
	public String profilePic;
	public List<String> department;

	public EmployeePayrollData(EmployeePayrollDTO emp) {
		this.updateEmployeePayrollData(emp);
	}

	private void updateEmployeePayrollData(EmployeePayrollDTO emp) {
		this.name = emp.name;
		this.salary = emp.salary;
		this.gender = emp.gender;
		this.start = emp.start;
		this.note = emp.note;
		this.profilePic = emp.profilePic;
		this.department = emp.department;

	}

}
