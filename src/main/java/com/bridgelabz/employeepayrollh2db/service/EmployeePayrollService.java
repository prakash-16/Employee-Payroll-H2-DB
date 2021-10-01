package com.bridgelabz.employeepayrollh2db.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollh2db.exceptions.EmployeePayrollException;
import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollData;
import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollDetails;
import com.bridgelabz.employeepayrollh2db.repository.EmployeePayrollRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService {
	@Autowired
	private EmployeePayrollRepository payrollList;

	public List<EmployeePayrollDetails> getDataAllEmployee() {
		return payrollList.findAll();
	}

	public EmployeePayrollDetails getDataById(int id) {
		return payrollList.findById(id).orElseThrow(() -> new EmployeePayrollException("id not found"));
	}

	public EmployeePayrollDetails createData(EmployeePayrollDTO empPayDTO) {
		EmployeePayrollDetails empData = new EmployeePayrollDetails(0, empPayDTO);
		EmployeePayrollData emp = new EmployeePayrollData(empPayDTO);
		log.debug(empData.toString());
		return payrollList.save(empData);
	}

	public EmployeePayrollDetails updateDetails(int id, EmployeePayrollDTO empPayDTO) {
		EmployeePayrollDetails empData = this.getDataById(id);
		EmployeePayrollData emp = new EmployeePayrollData(empPayDTO);
		return payrollList.save(empData);
	}

	public boolean deleteDetails(int id) {
		if(payrollList.findById(id) != null) {
			EmployeePayrollDetails empData = this.getDataById(id);
			payrollList.delete(empData);
			return true;
		}
		return false;
	}
}
