package com.wha.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wha.spring.iservice.UserService;
import com.wha.spring.model.User;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/create/dummy", method = RequestMethod.GET)
	public User dummy() {
		User u1 = new User(0, "Jemal Ahmed", "Ahmed.Jemal", "jmlhmd@gmail.com", null, null, null, null);
		userService.saveUser(u1);
		return u1;
	
	}
	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/get/all", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAll() {
		List<User> resultat = userService.findAllUsers();
		return new ResponseEntity<List<User>>(resultat, HttpStatus.OK);
	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		User newUser = userService.saveUser(user);
		return newUser;
	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		userService.updateUser(user);
		return user;
	}
	
	
	
}
