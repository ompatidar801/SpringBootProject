package com.aartek.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
@ComponentScan("com.aartek")				// Base Package name

public class HelloMain extends SpringBootServletInitializer
{

	public static void main(String[] args) 
	{

		SpringApplication.run(HelloMain.class, args);
		
		System.out.println("Hello Main Class");
	}

}
