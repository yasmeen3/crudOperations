package com.springdata.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springdata.first.model.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
