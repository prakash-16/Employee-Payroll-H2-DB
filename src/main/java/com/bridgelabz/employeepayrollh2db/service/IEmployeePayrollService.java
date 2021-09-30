package com.bridgelabz.employeepayrollh2db.service;

import java.util.List;

import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollDetails;

public interface IEmployeePayrollService {
	
	List<EmployeePayrollDetails> getDataAllEmployee();
	EmployeePayrollDetails getDataById(int id);
	EmployeePayrollDetails createData(EmployeePayrollDTO empPayDTO);
	EmployeePayrollDetails updateDetails(int id, EmployeePayrollDTO empPayDTO);

}
