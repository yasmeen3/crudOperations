package com.springdata.first.service;

import javax.print.attribute.standard.MediaSize.Other;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdata.first.model.entity.Employee;
import com.springdata.first.repository.EmpRepo;

@Service
public class EmployeeService {
	@Autowired
private EmpRepo empRepo;
	
	public Employee getUser(Integer id)
	{
		
		java.util.Optional<Employee> emp = this.empRepo.findById(id);
		
			return emp.orElse(new Employee());
	}
	
	public Employee save  (Employee emp) {
		Employee savedEmp = this.empRepo.save(emp);
		return savedEmp;
		
	}
	
	public void deleteEmployee(Integer id)
	{
		
		 this.empRepo.deleteById(id);
		
	}
}
