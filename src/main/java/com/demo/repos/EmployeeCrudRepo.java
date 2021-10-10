package com.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Employee;

public interface EmployeeCrudRepo extends JpaRepository<Employee, Long> {
	
	

}
