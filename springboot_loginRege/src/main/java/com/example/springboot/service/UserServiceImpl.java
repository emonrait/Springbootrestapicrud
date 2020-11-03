package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.ResponseModel;
import com.example.springboot.model.User;
import com.example.springboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	

	public UserServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		return userRepository.getOne(Integer.parseInt(userId));
	}

	@Override
	public User insertUser(User user) {
		userRepository.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		userRepository.save(user);
		return user;
	}

	@Override
	public void deleteUser(String userId) {
		User entity = userRepository.getOne(Integer.parseInt(userId));
		userRepository.delete(entity);

	}

	@Override
	public ResponseModel doLogin(String userId, String password) {
		ResponseModel outModel = new ResponseModel();
		if (userId.equals("emonra") && password.equals("12345")) {
			outModel.setOutCode("0");
			outModel.setOutMessage("Welcome to our awsome app");
			outModel.setUserId(outModel.getUserId());

		} else {
			outModel.setOutCode("1");
			outModel.setOutMessage("Invalid User or password");

		}
		return outModel;
	}

}
