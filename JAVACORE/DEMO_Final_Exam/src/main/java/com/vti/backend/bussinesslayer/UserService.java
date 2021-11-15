package com.vti.backend.bussinesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.User;

public class UserService implements IBussinessLayer {
	private UserRepository userRepository;
	
	public UserService() throws FileNotFoundException, IOException {
		userRepository = new UserRepository();
	}
	
	public List<User> getListUsers() throws ClassNotFoundException, SQLException{
		return userRepository.getListUsers();
	}
	
	public User getUserById(int id) throws SQLException, ClassNotFoundException {
		return userRepository.getUserById(id);
	}
	
	public User getUserLogin(String email_input, String password_input) throws ClassNotFoundException, SQLException {
		return userRepository.getUserLogin(email_input, password_input);
	}
	
	public User createUsers(String fullName , String email) throws ClassNotFoundException, SQLException {
		return userRepository.createUsers(fullName, email);
	}
	
	public void deleteUserById(int id) throws ClassNotFoundException, SQLException {
		userRepository.deleteUserById(id);
	}
	
}
