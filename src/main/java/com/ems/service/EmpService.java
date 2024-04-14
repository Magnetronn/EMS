package com.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.Dto.EmployeeDto;
import com.ems.Exception.EmployeeNotFoundException;
import com.ems.entity.Employee;


public interface EmpService {

	Employee addEmployees(EmployeeDto employeeDto);

	List<Employee> getAllEmploytee();

	Employee getEmpById(Integer id) throws EmployeeNotFoundException;
	
	

}
