package com.ems.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.Dto.EmployeeDto;
import com.ems.Exception.EmployeeNotFoundException;
import com.ems.Repository.EmpRepository;
import com.ems.entity.Employee;
import com.ems.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public Employee addEmployees(EmployeeDto employeeDto) {
		
		Employee employee = new Employee();
		employee.setFirstName(employeeDto.getFirstName());
		employee.setLastName(employeeDto.getLastName());
		employee.setEmail(employeeDto.getEmail());
		employee.setNationality(employeeDto.getNationality());
		
		return empRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmploytee() {
		List<Employee> allEmp = empRepository.findAll();
		return allEmp;
	}

	@Override
	public Employee getEmpById(Integer id) throws EmployeeNotFoundException {
		Employee empnyId = empRepository.findByEmpId(id);
		if(empnyId!=null) {
			return empnyId;
		}else {
			throw new EmployeeNotFoundException("user not found with id="+id);
		}
	}
	

}
