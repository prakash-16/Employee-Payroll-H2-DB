package com.bridgelabz.employeepayrollh2db.exceptions;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bridgelabz.employeepayrollh2db.models.Response;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class EmployeePayrollExceptionalHandler {
	private static final String msg = "Exception while processing Rest Request";

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Response> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
		List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
		List<String> errMsg = errorList.stream().map(objErr -> objErr.getDefaultMessage()).collect(Collectors.toList());
		Response resDTO = new Response("Exception while processing rest request", errMsg);
		return new ResponseEntity<Response>(resDTO, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(EmployeePayrollException.class)
	public ResponseEntity<Response> handleEmployeePayrollException(EmployeePayrollException exception) {
		Response resDTO = new Response("Exception while processing REST request", exception.getMessage());
		return new ResponseEntity<Response>(resDTO, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<Response> handleHttpMessageNotReadableException(HttpMessageNotReadableException exception) {
		log.error("Invalid date format", exception);
		Response resDTO = new Response(msg, "Should be in format dd MMM yyyy");
		return new ResponseEntity<Response>(resDTO, HttpStatus.BAD_REQUEST);
	}

}
