package com.vti.backend.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

public interface IPresentationLayer {
	List<User> getListUsers() throws ClassNotFoundException, SQLException;
	User getUserById(int id) throws SQLException, ClassNotFoundException;
	User getUserLogin(String email_input, String password_input) throws ClassNotFoundException, SQLException;
	User createUsers(String fullName_input , String email_input) throws ClassNotFoundException, SQLException;
	void deleteUserById(int id) throws ClassNotFoundException, SQLException;
}
