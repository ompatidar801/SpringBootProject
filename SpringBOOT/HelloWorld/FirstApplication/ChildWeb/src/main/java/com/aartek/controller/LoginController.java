package com.aartek.controller;

import java.util.Map;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.User;
import com.aartek.service.LoginService;

@Controller
public class LoginController {

	
	private static final Logger log = Logger.getLogger(LoginController.class);
	
	@Autowired
	private LoginService lservice;
	
	@RequestMapping(value= "/login")
	public String loginGET(Model map)
	{
		log.info("GET Method");
		
		System.out.println("GET Method");
		
		map.addAttribute("UserLogin", new User());	
		
		return "login";
	}
	
	
	@RequestMapping(value= "/login", method=RequestMethod.POST)
	public String loginPage(@ModelAttribute("UserLogin") User user, Model map) 
	{
		

		System.out.println("POST Method");
		
		log.info("Login Controller POST Method ");
		
	//	System.out.println("Email :----"+user.getEmail());
		
		log.info("Email :----"+user.getEmail());
		
	//	System.out.println("Password :---"+user.getPassword());

		log.info("Password :---"+user.getPassword());

		
		lservice.loginServicePage(user);
		
	
		return "Hello";
	}

}
