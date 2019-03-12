package com.aartek.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.aartek.repository.LoginRepo;

@Component
public class SessionInterceptor extends HandlerInterceptorAdapter
{

	@Autowired
	private LoginRepo lrepo;


	
	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object arg2, Exception arg3)
			throws Exception {

		System.out.println("Session Interceptor :- After Completion Method.");
		
		
	}

	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object arg2, ModelAndView arg3)
			throws Exception {

		System.out.println("Session Interceptor :- Post Handle Method");
		
	}

	
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object arg2) throws Exception {
		

		System.out.println("Session Interceptor :- Pre Handler Method");

		System.out.println("____________________________________________");
		
		String reuestURI=req.getRequestURI();
		
		String headerEMAIL=req.getHeader("email");
		
		String headerPASSWORD=req.getHeader("password");
		
		
		System.out.println("URI is :--- "+reuestURI);
		
		System.out.println("Header Email :--- "+headerEMAIL);
		
		System.out.println("Header Password :--- "+headerPASSWORD);
		
		System.out.println("____________________________________________");
		
		
		lrepo.checkInterceptorAuthontication(headerEMAIL, headerPASSWORD);
		
		boolean status=true;
		
		if(status==false)
		{
			System.out.println("Inside If Part");
			
			return false;
			
		}
		
		return true;

		
	}
	
}
