package com.bridgelabz.employeepayrollh2db.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.bridgelabz.employeepayrollh2db.models.Response;
import com.bridgelabz.employeepayrollh2db.service.IEmployeePayrollService;

@RestController
@RequestMapping("/employee/payroll")
class EmployeePayrollController {
	@Autowired
	IEmployeePayrollService empServ;

	@RequestMapping(value = { "/", "/get/all" })
	public ResponseEntity<Response> getAllData() {
		Response res = new Response("Get call Success", empServ.getDataAllEmployee());
		return new ResponseEntity<Response>(res, HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Response> getDataById(@PathVariable int id) {
		Response res = new Response("Get call id Success", empServ.getDataById(id));
		return new ResponseEntity<Response>(res, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<Response> addEmpData(@Valid @RequestBody EmployeePayrollDTO empPayDTO) {
		Response res = new Response("Create employee payroll data success", empServ.createData(empPayDTO));
		return new ResponseEntity<Response>(res, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Response> updateEmpData(@Valid @PathVariable(value = "id") int id,
			@RequestBody EmployeePayrollDTO empPayDTO) {
		Response res = new Response("Updated employee payroll data success", empServ.updateDetails(id, empPayDTO));
		return new ResponseEntity<Response>(res, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmpData(@PathVariable int id) {
		Response res = new Response("Details deleted successfully", empServ.deleteDetails(id));
		return new ResponseEntity<String>("Deleted call success", HttpStatus.OK);
	}
}
