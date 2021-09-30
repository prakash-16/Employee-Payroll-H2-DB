package com.bridgelabz.employeepayrollh2db.models;

import java.util.List;

public class Response {
	private String message;
	private Object emp;

	public Response(String message, Object emp) {
		super();
		this.message = message;
		this.emp = emp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getEmp() {
		return emp;
	}

	public void setEmp(Object emp) {
		this.emp = emp;
	}

}
