package com.example.util;

import java.util.ArrayList;
import java.util.List;

import com.example.data.User;

public class Utility {
	
	private static List<User> lstUsers = new ArrayList<>();
	
	public static String addUser(User user) {
		lstUsers.add(user);
		return "User added is : "+ user.getName();
	}

	public static List<User> getAllUsers(){
		return lstUsers;
	}
	
}
