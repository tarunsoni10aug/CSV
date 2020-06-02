package com.telstra.codechallenge.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootUserCoontroller {
	
	@Autowired
	private UserService service;
	
	@GetMapping	( "/user/{limit}")
	public List<UserDetails> oldestUser(@PathVariable int limit){
	    return service.getOldestUser(limit);
	    	
	  }

}
