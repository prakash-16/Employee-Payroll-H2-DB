package com.bridgelabz.employeepayrollh2db.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee/payroll")
public class EmployeePayrollController {
	@RequestMapping(value = { "", "/" })
	public String connection() {
		return "Connection Eastablished";
	}
}
