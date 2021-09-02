package com.example.main;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping(value="/hello",produces =MediaType.APPLICATION_JSON_VALUE,consumes ="TEXT_PLAIN")
	public Employee showStatus() throws EmployeeRecordNotFound {
		Employee emp=null;
		if(emp==null){
			throw new EmployeeRecordNotFound("Data Not Found");
		}
		return emp;
	}

	
	@PostMapping("/save")
	public  Employee  getData(@RequestBody Employee emp) throws EmployeeRecordNotFound {
		
		return emp;
	}

}
