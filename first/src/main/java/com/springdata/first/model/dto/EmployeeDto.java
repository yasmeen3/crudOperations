package com.springdata.first.model.dto;

import com.springdata.first.model.entity.Employee;
import lombok.AllArgsConstructor;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private Integer id;

    private String firstName;

    private String lastName;

    private Double salary;

    public static  EmployeeDto toDto(Employee employee)
    {
        return EmployeeDto.builder().
                id(employee.getId()).
                firstName(employee.getFirstName()).
                lastName(employee.getLastName()).
                salary(employee.getSalary()).build();
    }


}
