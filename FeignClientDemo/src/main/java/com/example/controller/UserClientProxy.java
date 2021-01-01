package com.example.controller;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.data.User;

//@FeignClient(name = "User", url = "http://localhost:8080")
@FeignClient(name = "User")
@RibbonClient(name = "User")
public interface UserClientProxy {
	
	@RequestMapping(method = RequestMethod.GET, value = "/user")
	List<User> getAllUsers();

	/*
	 * @RequestMapping(method = RequestMethod.GET, value = "/user/{id}") User
	 * getUser(@PathVariable("id") int id);
	 * 
	 * @RequestMapping(method = RequestMethod.DELETE, value = "/user/{id}")
	 * ResponseEntity deleteUser(@PathVariable("id") int id);
	 */

	/*
	 * @RequestMapping(method = RequestMethod.POST, value = "/addUser/")
	 * ResponseEntity addUser(@RequestBody User user);
	 */
	/*
	 * @RequestMapping(method = RequestMethod.PUT, value = "/user/") ResponseEntity
	 * updateUser(User user);
	 */
}