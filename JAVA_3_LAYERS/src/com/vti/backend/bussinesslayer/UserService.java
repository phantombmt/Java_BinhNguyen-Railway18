package com.vti.backend.bussinesslayer;

import java.util.List;

import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.User;

public class UserService {
	private UserRepository userRepository;
	
	public UserService() {
		userRepository = new UserRepository();
	}
	
	public List<User> getListUsersService(){
		return userRepository.getListUsersRepository();
	}

}
