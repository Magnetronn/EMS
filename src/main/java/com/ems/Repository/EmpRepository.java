package com.ems.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>{

	Employee findByEmpId(int id);

	//Kya haal chaal
	 

}
