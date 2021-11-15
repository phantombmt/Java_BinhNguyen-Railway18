package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.bussinesslayer.UserService;
import com.vti.entity.User;

public class UserController implements IPresentationLayer {
	private UserService userService ;
	
	public UserController() throws FileNotFoundException, IOException {
		userService = new UserService();
	}
	
	public List<User> getListUsers() throws ClassNotFoundException, SQLException{
		return userService.getListUsers();
	}
	
	public User getUserById(int id) throws SQLException, ClassNotFoundException {
		return userService.getUserById(id);
	}
	
	public User getUserLogin(String email_input, String password_input) throws ClassNotFoundException, SQLException {
		return userService.getUserLogin(email_input, password_input);
	}
	
	public User createUsers(String fullName , String email) throws ClassNotFoundException, SQLException {
		return userService.createUsers(fullName, email);
	}
	
	public void deleteUserById(int id) throws ClassNotFoundException, SQLException {
		userService.deleteUserById(id);
	}
}
