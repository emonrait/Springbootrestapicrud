package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.ResponseModel;
import com.example.springboot.model.User;


public interface UserService {

	public List<User> getAllUsers();
	
	public User getUser(String userId);
	
	public User insertUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(String userId);
	
	 ResponseModel doLogin(String userId, String password);

}
