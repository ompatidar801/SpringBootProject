package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

	
	@Autowired
	private EntityManagerFactory entityManagerFactory;


	public void createUser(User user) {
		
		logger.warn("Inside Service : Create User Method");
		
		logger.warn(user.getEmail());
		logger.warn(user.getPassword());
		
	//	userrepository.checkUser(login);
		
		urepointerface.save(user);
		

		
				
	}

	public List<User> getUser() {
	
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery criteria = builder.createQuery(UserDetails.class);
		Root contactRoot = criteria.from(UserDetails.class);
		criteria.select(contactRoot);
		return session.createQuery(criteria).getResultList();

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
