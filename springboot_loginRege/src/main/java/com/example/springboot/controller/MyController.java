package com.example.springboot.controller;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.ResponseModel;
import com.example.springboot.model.User;
import com.example.springboot.service.UserService;

@RestController
public class MyController {
	private UserService userService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to my awesome app";
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return this.getAllUsers();

	}

	@GetMapping("/users/{userId}")
	public User getUsers(@PathVariable String userId) {
		return this.userService.getUser(String.valueOf(userId));

	}

	@PostMapping("/insertuser")
	public User saveUser(@RequestBody User user) {
		return this.userService.insertUser(user);
	}
	
	@GetMapping(value = "/login")
	@ResponseBody
	public ResponseModel loginInformation(Model model, @Param("userId") String userId,
			@Param("password") String password) {
		return userService.doLogin(userId, password);
	}

	@PutMapping("/userupdate")
	public User upadteUser(@RequestBody User user) {
		return this.userService.updateUser(user);

	}

	@DeleteMapping("/users/{userId}")
	public ResponseEntity<HttpStatus> deleteUsers(@PathVariable String userId) {
		try {
			this.userService.deleteUser(String.valueOf(userId));
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
