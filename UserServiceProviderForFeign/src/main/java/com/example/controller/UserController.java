package com.example.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.User;
import com.example.util.Utility;

@RestController
public class UserController {

	@GetMapping("/heartbeat")
	public String heartbeat() {
		return new String("Heartbeat");
	}

	@PostMapping(value = "/addUser", consumes = "application/json",produces = "application/json")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		Utility.addUser(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@GetMapping("/user")
	public List<User> getUsers() {
		System.out.println("get");
		List<User> users = Utility.getAllUsers();
		return users;
	}
}
