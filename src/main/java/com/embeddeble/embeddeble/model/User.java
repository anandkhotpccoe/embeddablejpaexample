package com.embeddeble.embeddeble.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	
	@Id
	private Long id;
	
	
	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(name = "addressLine1", column = @Column(name = "house_number")),
			@AttributeOverride(name = "addressLine2", column = @Column(name = "street"))
			
	}
	)
	private Address address;
	
	
	
	@Embedded
	private Name name;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public Name getName() {
		return name;
	}



	public void setName(Name name) {
		this.name = name;
	}



	public User(Long id, Address address, Name name) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
	}



	public User() {
		
	}
	
	
	
}
