package com.bridgelabz.employeepayrollh2db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollData;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {
	@Query(value="select * from payroll_service, department where emp_id = id and department = :department", nativeQuery = true);
	List<EmployeePayrollData> findEmployeesByDepartment(String department);

}
