package com.example.main;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmployeeRecordNotFound extends Exception {

	public EmployeeRecordNotFound(String message) {
		super(message);

	}

}
