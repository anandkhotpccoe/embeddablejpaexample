package com.embeddeble.embeddeble;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.embeddeble.embeddeble.model.Address;
import com.embeddeble.embeddeble.model.Name;
import com.embeddeble.embeddeble.model.User;
import com.embeddeble.embeddeble.repository.UserRepository;



@SpringBootApplication
public class EmbeddebleApp implements CommandLineRunner{

	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EmbeddebleApp.class, args);
		
		
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User(1l,new Address("Laxmi Heights","Datta Mandir Road","CGTMSE", "Kulra", "Baner", "Pune"), new Name("Anand", "Pramod","Khot"));
		
		userRepository.save(user);
	}
	
	
	
	
}
