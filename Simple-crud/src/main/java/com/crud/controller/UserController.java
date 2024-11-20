package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.User;
import com.crud.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@PostMapping("/saveUser")
	public User addUser(@RequestBody User user) {
		return userService.saveUser(user);	
	}
	@PostMapping("/saveAllUsers")
	public List<User> addAllUser(@RequestBody List<User> user){
		return userService.saveAllUuser(user);
	}
	
//	get
	
	@GetMapping("/getUserById/{id}")
	public User finduserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@GetMapping("/getAllUsers")
	public List<User> findAllUser(){
		return userService.getAllUser();	
	}
	@GetMapping("/getUserByName/{name}")
	public User findByName(@PathVariable String name) {
		return userService.getUserByName(name);
	}
	

//	delete
	@DeleteMapping("/deleteUserById/{id}")
	public String delteUser(@PathVariable int id) {
		
		return userService.deleteUserById(id);
	}
	
//	update
	@PutMapping("/updateUser")
	public User updateUsers(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
}
