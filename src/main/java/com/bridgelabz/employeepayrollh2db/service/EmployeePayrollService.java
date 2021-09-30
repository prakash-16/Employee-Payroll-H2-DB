package com.bridgelabz.employeepayrollh2db.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollDetails;
@Service
public class EmployeePayrollService implements IEmployeePayrollService {
	
	public List<EmployeePayrollDetails> getDataAllEmployee() {
		@SuppressWarnings("unchecked")
		List<EmployeePayrollDetails> payrollList = new ArrayList();
		payrollList.add(new EmployeePayrollDetails(1, new EmployeePayrollDTO("Karan", 96000)));
		return payrollList;
	}

	public EmployeePayrollDetails getDataById(int id) {
		EmployeePayrollDetails empData = new EmployeePayrollDetails(id, new EmployeePayrollDTO("Karan", 96000));
		return empData;
	}

	public EmployeePayrollDetails createData(EmployeePayrollDTO empPayDTO) {
		EmployeePayrollDetails empData = new EmployeePayrollDetails(1, empPayDTO);
		return empData;
	}

	public EmployeePayrollDetails updateDetails(int id, EmployeePayrollDTO empPayDTO) {
		EmployeePayrollDetails empData = new EmployeePayrollDetails(id, empPayDTO);
		return empData;
	}
}
