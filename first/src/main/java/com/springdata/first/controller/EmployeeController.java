package com.springdata.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springdata.first.model.entity.Employee;
import com.springdata.first.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/getEmployee")
	public  ResponseEntity<Employee> getEmployee(@RequestParam Integer id) {
		Employee emp =  empService.getUser(id);
		return new ResponseEntity<>(emp, HttpStatus.OK);
	
		
	}
	
	@PostMapping("/saveEmployee")
	public  Employee saveEmployee(@RequestBody Employee emp) {
		return empService.save(emp);
	
		
	}

	@DeleteMapping("/deleteEmployee")
	public  void deleteEmployee(@RequestParam Integer id) {
		 empService.deleteEmployee(id);
	
		
	}
}
