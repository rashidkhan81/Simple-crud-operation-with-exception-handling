package com.crud.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.config.ResourceNotFoundException;
import com.crud.entity.User;
import com.crud.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	@Override
	public List<User> saveAllUuser(List<User> user) {
		// TODO Auto-generated method stub
		return userRepository.saveAll(user);
	}
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		 return userRepository.findById(id).orElseThrow(() -> 
	        new ResourceNotFoundException("User not found with id: " + id)
	    );
	}
	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(name);
	}
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	@Override
	public User updateUser(User user) {
		User user2 = userRepository.findById(user.getId()).orElse(null);
		user2.setUserName(user.getUserName());
		user2.setEmail(user.getEmail());
		user2.setPhone(user.getPhone());
		return userRepository.save(user2);
		// TODO Auto-generated method stu
	}
	@Override
	public String deleteUserById(int id) {
		// TODO Auto-generated method stub
	  userRepository.deleteById(id);
		return "user delted by this id " +id;
		
	}
}
