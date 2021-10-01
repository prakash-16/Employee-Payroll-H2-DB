package com.bridgelabz.employeepayrollh2db.service;

import java.util.List;

import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollData;
import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollDetails;

public interface IEmployeePayrollService {

	List<EmployeePayrollData> getDataAllEmployee();

	EmployeePayrollData getDataById(int id);

	EmployeePayrollData createData(EmployeePayrollDTO empPayDTO);

	EmployeePayrollData updateDetails(int id, EmployeePayrollDTO empPayDTO);

	boolean deleteDetails(int id);
	
	EmployeePayrollData getDepartment(String dept);

}
