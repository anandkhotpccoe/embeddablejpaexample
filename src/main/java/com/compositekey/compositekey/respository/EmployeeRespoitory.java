package com.compositekey.compositekey.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compositekey.compositekey.model.Employee;
import com.compositekey.compositekey.model.EmployeeIdentity;

@Repository
public interface EmployeeRespoitory extends JpaRepository<Employee, EmployeeIdentity> {
	
	

}
