package com.aartek.repositoryInterface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aartek.model.User;

@Repository
public interface UserRepositoryInterface extends CrudRepository<User, Integer>
{

	
	
}
