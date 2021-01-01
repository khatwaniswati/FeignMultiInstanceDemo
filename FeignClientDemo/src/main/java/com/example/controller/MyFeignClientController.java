package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.User;


@RestController
public class MyFeignClientController {

	@Autowired
	private UserClientProxy userClient;
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		System.out.println("Calling User Service using Feign Client!!");
		List<User> users = userClient.getAllUsers();
		return users;
	}
	
}
