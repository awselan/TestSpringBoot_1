package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class DemoApplication {

//	@Autowired	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World! Welcome!");
		
		Alien a1 = context.getBean(Alien.class);
//		Alien a2 = context.getBean(Alien.class);
			a1.show();
		
	}
}
