package com.bridgelabz.employeepayrollh2db.models;

import java.sql.Date;

public class EmployeeDetails {
	private int id;
	private String name;
	private char gender;
	private Date start;
	private double salary;

	public EmployeeDetails(int id, String name, char gender, Date start, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.start = start;
		this.salary = salary;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", gender=" + gender + ", start=" + start + ", salary="
				+ salary + "]";
	}
	
	

}
