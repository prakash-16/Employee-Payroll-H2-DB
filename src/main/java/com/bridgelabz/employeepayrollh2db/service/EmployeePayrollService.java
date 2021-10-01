package com.bridgelabz.employeepayrollh2db.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollh2db.exceptions.EmployeePayrollException;
import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollDetails;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {
	private List<EmployeePayrollDetails> payrollList = new ArrayList();

	public List<EmployeePayrollDetails> getDataAllEmployee() {
		return payrollList;
	}

	public EmployeePayrollDetails getDataById(int id) {
		return payrollList.stream().filter(empDetails -> empDetails.getId() == id).findFirst()
				.orElseThrow(() -> new EmployeePayrollException("Employee Not Found"));
	}

	public EmployeePayrollDetails createData(EmployeePayrollDTO empPayDTO) {
		EmployeePayrollDetails empData = new EmployeePayrollDetails(payrollList.size() + 1, empPayDTO);
		payrollList.add(empData);
		return empData;
	}

	public EmployeePayrollDetails updateDetails(int id, EmployeePayrollDTO empPayDTO) {
		EmployeePayrollDetails empData = this.getDataById(id);
		empData.setName(empPayDTO.getName());
		empData.setSalary(empPayDTO.getSalary());
		payrollList.add(id - 1, empData);
		return empData;
	}

	public boolean deleteDetails(int id) {
		if (payrollList.remove(id - 1) != null) {
			return true;
		} else {
			return false;
		}
	}
}
