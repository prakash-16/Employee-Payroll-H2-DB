package com.bridgelabz.employeepayrollh2db.models;

import lombok.Data;

public @Data class Response {
	private String message;
	private Object emp;

	public Response(String message, Object emp) {
		this.message = message;
		this.emp = emp;
	}

}
