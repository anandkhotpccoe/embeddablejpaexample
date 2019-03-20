package com.compositekey.compositekey.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employee {
	
	@EmbeddedId
	private EmployeeIdentity emp;
	
	@Size(min = 3 , max = 40)
	private String name;
	
	@NotNull
	@Size(min =6, max = 60)
	private String email;

	public Employee(EmployeeIdentity emp, @Size(min = 3, max = 40) String name,
			@NotNull @Size(min = 6, max = 60) String email) {
		super();
		this.emp = emp;
		this.name = name;
		this.email = email;
	}
	
	
	public Employee()
	{
		
	}


	public EmployeeIdentity getEmp() {
		return emp;
	}


	public void setEmp(EmployeeIdentity emp) {
		this.emp = emp;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
	
}
