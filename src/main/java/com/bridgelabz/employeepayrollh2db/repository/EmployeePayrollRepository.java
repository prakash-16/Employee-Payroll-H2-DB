package com.bridgelabz.employeepayrollh2db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollDetails;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollDetails,Integer>{

}
