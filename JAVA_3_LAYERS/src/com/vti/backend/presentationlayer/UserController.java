package com.vti.backend.presentationlayer;

import java.util.List;

import com.vti.backend.bussinesslayer.UserService;
import com.vti.entity.User;

public class UserController {
	private UserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	
	public List<User> getListUsersController(){
		return userService.getListUsersService();
	}
	
}
