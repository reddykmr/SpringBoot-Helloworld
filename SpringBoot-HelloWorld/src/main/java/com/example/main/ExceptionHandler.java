package com.example.main;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler(EmployeeRecordNotFound.class)
	public ResponseEntity<Object> DataNotFound(EmployeeRecordNotFound ex,WebRequest req){
		return  new ResponseEntity(ex.getMessage(), HttpStatus.NOT_FOUND);
		
	}

	

}
