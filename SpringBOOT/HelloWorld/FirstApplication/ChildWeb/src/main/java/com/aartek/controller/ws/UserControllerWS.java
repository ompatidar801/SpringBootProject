package com.aartek.controller.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aartek.model.User;
import com.aartek.service.LoginService;

@Controller
public class UserControllerWS {
	
@Autowired	
private LoginService lservice;	
	
@ResponseBody	
@RequestMapping(value="/User/{email}/{password}" ,method=RequestMethod.GET)	
public User getUser(@PathVariable String email, @PathVariable String password)
{
	System.out.println("Inside User Web-Service GET Method");
	
	User user=new User();
	
	user.setEmail(email);
	
	user.setPassword(password);
			
	System.out.println();
	System.out.println("Email Id :- "+email);
	
	System.out.println("Password :- "+password);
		
	return user;
}


@ResponseBody
@RequestMapping(value="/User", method=RequestMethod.POST)
public User getUserPost(@RequestBody User user)
{

	System.out.println("POST Method");
	
	System.out.println("Email Id :- "+user.getEmail());
	
	System.out.println("Password :- "+user.getPassword());

	lservice.loginServicePage(user);

	
	return user;
}


}
