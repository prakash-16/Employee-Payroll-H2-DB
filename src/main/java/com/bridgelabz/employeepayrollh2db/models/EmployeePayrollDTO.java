package com.bridgelabz.employeepayrollh2db.models;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

public @Data class EmployeePayrollDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee name Invalid")
	public String name;

	@Min(value = 3000, message = "Minimum wage should be greater than 3000/-")
	public long salary;

	@Pattern(regexp = "male|female", message = "Gender should either male of female")
	public String gender;


	@JsonFormat(pattern = "dd MM yyyy")
	@NotNull(message = "start date shouldn't be empty")
	@PastOrPresent(message = "start date should be past or today date")	
	public LocalDate start;

	@NotBlank(message = "Note can't be empty")
	public String note;

	@NotBlank(message = "Profile picture can't be empty")
	public String profilePic;

	@NotNull(message = "Depart can't be null")
	public List<String> department;

}
