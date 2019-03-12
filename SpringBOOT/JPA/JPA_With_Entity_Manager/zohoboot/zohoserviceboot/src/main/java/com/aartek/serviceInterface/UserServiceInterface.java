package com.aartek.serviceInterface;

import java.util.List;

import com.aartek.model.User;

public interface UserServiceInterface 
{
	
	   public void createUser(User user);
	   
	    public List<User> getUser();
	   
	    public User findById(Integer id);
	    
	    public User update(User user, Integer id);
	    
	    public void deleteUserById(Integer id);
	    
	    public User updatePartially(User user, Integer id);

}
