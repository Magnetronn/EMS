package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.Dto.EmployeeDto;
import com.ems.Exception.EmployeeNotFoundException;
import com.ems.entity.Employee;
import com.ems.service.EmpService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/emp")
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeController {
	
	@Autowired
    private EmpService empService;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployees(@RequestBody @Valid EmployeeDto employeeDto){
		Employee savedEmp = empService.addEmployees(employeeDto);
		return new ResponseEntity<Employee>(savedEmp, HttpStatus.CREATED);
	}
	
	 @GetMapping("/all")
	 public ResponseEntity<List<Employee>> getAllEmployee(){
		 List<Employee> allemps= empService.getAllEmploytee();
		 return new ResponseEntity<List<Employee>>(allemps,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Employee> getEmpById(@PathVariable int id) throws EmployeeNotFoundException{
		Employee empById= empService.getEmpById(id);
		return new ResponseEntity<Employee>(empById,HttpStatus.OK);
		 
	 }
	
	

}
