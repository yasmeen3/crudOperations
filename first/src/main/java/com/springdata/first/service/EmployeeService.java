package com.springdata.first.service;

import com.springdata.first.model.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdata.first.model.entity.Employee;
import com.springdata.first.repository.EmpRepo;

import java.util.List;

@Service
public class EmployeeService {
	@Autowired
private EmpRepo empRepo;
	
	public EmployeeDto getUser(Integer id)
	{
		
		java.util.Optional<Employee> emp = empRepo.findById(id);
		return emp.map(EmployeeDto::toDto).orElse(null);
//		if(emp.isPresent())
//			return EmployeeDto.toDto(emp.get());
//		else
//			return null;
	}
	
	public EmployeeDto save  (EmployeeDto emp) {
		return  EmployeeDto.toDto(empRepo.save(Employee.toEntity(emp)));

		
	}
	
	public void deleteEmployee(Integer id)
	{
		
		 empRepo.deleteById(id);
		
	}

	public List<Employee> findAllEmployees()
	{
		return empRepo.findAll();
	}
}

