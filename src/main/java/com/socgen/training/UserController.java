package com.socgen.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	//Fetch all users
	@RequestMapping("/users")
	List<UserM> getUsers() {
		
		return service.getUsers();
		
	}
	
	//Fetch a particular user by id
	
	@RequestMapping("/users/{id}")
	Optional<UserM> getUser(@PathVariable Integer id) {
		
		return service.getUser(id);
	}
	
	
	//Add a new User
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	void addUser(@RequestBody UserM user) {
		service.addUser(user);
	}
	
	
	//Update a particluar user by id
	
	@RequestMapping(method = RequestMethod.PUT, value="/users")
	void updateUser(@RequestBody UserM user) {
		
		service.updateUser(user);
	}
	
	
	//Delete a particular User by id
	
		@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
		void deleteUser(@PathVariable Integer id) {
			service.deleteUser(id);
			}
		
		
		
		
	
	
	
	
	
}