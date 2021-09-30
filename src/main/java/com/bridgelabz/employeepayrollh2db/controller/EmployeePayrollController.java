package com.bridgelabz.employeepayrollh2db.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollh2db.models.EmployeePayrollDTO;

@RestController
@RequestMapping("/employee/payroll")
class EmployeePayrollController {

	@RequestMapping(value = { "/", "/get/all" })
	public ResponseEntity<String> getAllData() {
		return new ResponseEntity<String>("Get call Succues", HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<String> getDataById(@PathVariable int id) {
		System.out.println(id);
		return new ResponseEntity<String>("Get Id call Success", HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<String> addEmpData(@RequestBody EmployeePayrollDTO empPayDTO) {
		return new ResponseEntity<String>("Create employee payroll data success", HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateEmpData(@PathVariable(value="id")  int id, @RequestBody EmployeePayrollDTO empPayDTO) {
		return new ResponseEntity<String>("Updated employee payroll data success", HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmpData(@RequestBody EmployeePayrollDTO empPayDTO) {
		return new ResponseEntity<String>("Deleted call success", HttpStatus.OK);
	}
}
