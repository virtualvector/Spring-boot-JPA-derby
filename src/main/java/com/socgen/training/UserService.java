package com.socgen.training;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;

	
	//Returns all users
	public List<UserM> getUsers() {	
		return (List<UserM>)repository.findAll();		
	}

	//Add a new user to tha table
	public void addUser(UserM user) {
		repository.save(user);	
	}

	//Get a user by id
	Optional<UserM> getUser(Integer id) {
		return repository.findById(id);
	}

	//Updates a particular user by id
	public void updateUser(UserM user) {
		repository.save(user);
		
	}

	//Deletes a particular user by id
	public void deleteUser(Integer id) {
		repository.deleteById(id);
		
	}
	
	
	
	
	
	
	
	
	
}
