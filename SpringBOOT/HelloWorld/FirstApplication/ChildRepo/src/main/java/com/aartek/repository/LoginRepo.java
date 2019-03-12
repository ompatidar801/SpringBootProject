package com.aartek.repository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aartek.model.User;

@Repository
@Transactional
public class LoginRepo {

	
	private static final Logger log=Logger.getLogger(LoginRepo.class);
	
	@Autowired
	private HibernateTemplate hbtemplate;
	
	public String loginRepoPage(User user)
	{
		
		log.debug("Login Repository Class");
		
		hbtemplate.save(user);
		
		return "login";
	}
	

	public Boolean checkInterceptorAuthontication(String email, String password)
	{
		
		System.out.println("Inside Repository (Interceptor Authontication)");
		
		System.out.println("Login Repository (EMAIL):--- "+email);
		
		System.out.println("Login Repository (PASSWORD):--- "+password);
		
		return true;
	}


}