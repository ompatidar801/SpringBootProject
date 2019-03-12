package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import com.aartek.model.User;
import com.aartek.repository.UserRepository;
import com.aartek.repositoryInterface.UserRepositoryInterface;
import com.aartek.serviceInterface.UserServiceInterface;


@Service
@Transactional
public class UserService implements UserServiceInterface
{
	
/*	@Autowired
	private UserRepository userrepository; 
*/	
	
	@Autowired
	private UserRepositoryInterface urepointerface;
	
	final static Logger logger = Logger.getLogger(UserService.class);


	public void createUser(User user) {
		
		logger.warn("Inside Service : Create User Method");
		
		logger.warn(user.getEmail());
		logger.warn(user.getPassword());
		
	//	userrepository.checkUser(login);
		
		urepointerface.save(user);
		

		
				
	}

	public List<User> getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User update(User user, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public User updatePartially(User user, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
