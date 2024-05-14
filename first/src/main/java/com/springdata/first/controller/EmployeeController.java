package com.springdata.first.controller;

import com.springdata.first.model.dto.EmployeeDto;
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

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/getEmployee")
	public  ResponseEntity<EmployeeDto> getEmployee(@RequestParam Integer id) {
		EmployeeDto emp =  empService.getUser(id);
		return new ResponseEntity<>(emp, HttpStatus.OK);
	
		
	}
	
	@PostMapping("/saveEmployee")
	public  EmployeeDto saveEmployee(@RequestBody EmployeeDto emp) {
		return empService.save(emp);
	
		
	}

	@DeleteMapping("/deleteEmployee")
	public  void deleteEmployee(@RequestParam Integer id) {
		 empService.deleteEmployee(id);
	
		
	}

	@PostMapping("/updateEmployee")
	public  EmployeeDto updateEmployee(@RequestBody EmployeeDto emp) {
		return empService.save(emp);


	}

	@GetMapping("/getAllEmployees")
	public List<Employee> getAll() {
		return empService.findAllEmployees();


	}

}
