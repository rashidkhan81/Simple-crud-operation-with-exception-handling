package com.crud.service;

import java.util.List;

import com.crud.entity.User;

public interface UserService {

	public User saveUser(User user);
	public List<User> saveAllUuser(List<User> user);
	
	public User getUserById(int id);
	public User getUserByName(String name);
	public List<User> getAllUser();
	
	public User updateUser(User user);
	public String deleteUserById(int id);
	
	
}
