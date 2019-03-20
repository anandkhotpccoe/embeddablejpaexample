package com.compositekey.compositekey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.compositekey.compositekey.model.Employee;
import com.compositekey.compositekey.model.EmployeeIdentity;
import com.compositekey.compositekey.respository.EmployeeRespoitory;

@SpringBootApplication
public class CompositekeyApplication implements CommandLineRunner{

	
	@Autowired
	private EmployeeRespoitory employeeRespoitory;
	
	public static void main(String[] args) {
		SpringApplication.run(CompositekeyApplication.class, args);
		
		
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee(new EmployeeIdentity(1l,1l), "Anand", "anandkhot.pccoe@gmail.com");
		employeeRespoitory.save(employee);
		
	}
	
	
	
	
}
