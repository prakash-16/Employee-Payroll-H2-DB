package com.bridgelabz.employeepayrollh2db.models;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollDetails [id=" + id + ", Name =" + empDto.getName() + ", Salary =" + empDto.getSalary()
				+ "]";
	}

}
