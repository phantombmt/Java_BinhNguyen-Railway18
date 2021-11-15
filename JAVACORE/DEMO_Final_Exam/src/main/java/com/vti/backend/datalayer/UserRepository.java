package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Role;
import com.vti.entity.User;
import com.vti.utils.JdbcUtils;

public class UserRepository implements IDataLayer {

	private JdbcUtils jdbcUltils;
	private Connection connection;

	public UserRepository() throws FileNotFoundException, IOException {
		jdbcUltils = new JdbcUtils();
	}

	public List<User> getListUsers() throws SQLException, ClassNotFoundException {

		try {
			List<User> listUsers = new ArrayList<User>();
			connection = jdbcUltils.getConnection();

			// SELECT * FROM user
			String sqlQuery = "SELECT * FROM user";

			// Use class Statement to query sql by statement of this connection:
			Statement statement = connection.createStatement();

			// Return value of Jdbc

			ResultSet result = statement.executeQuery(sqlQuery);
			while (result.next()) {
				int id = result.getInt("UserID");
				String fullName = result.getString("FullName");
				String email = result.getString("Email");
				String password = result.getString("Password");
				Role role = Role.valueOf(result.getString("Role"));

				User user = new User(id, fullName, email, password, role);
				listUsers.add(user);
			}

			return listUsers;

		} finally {
			connection.close();
		}

	}

	public User getUserById(int id) throws SQLException, ClassNotFoundException {
		try {
			User user = null;
			connection = jdbcUltils.getConnection();
			// C1:
//			String sqlQuery = "SELECT * FROM user WHERE UserID =" + id;
//			Statement statement = connection.createStatement();
//			ResultSet result = statement.executeQuery(sqlQuery);

			// C2:
			String sqlQuery = "SELECT * FROM `User` WHERE UserID = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, id);
			ResultSet result = preparedStatement.executeQuery();

			while (result.next()) {
				int userID = result.getInt("UserID");
				String fullName = result.getString("FullName");
				String email = result.getString("Email");
				String password = result.getString("Password");
				Role role = Role.valueOf(result.getString("Role"));

				user = new User(userID, fullName, email, password, role);

			}
			return user;

		} finally {
			connection.close();
		}

	}

	public User getUserLogin(String email_input, String password_input) throws ClassNotFoundException, SQLException {
		try {
			User user = null;
			connection = jdbcUltils.getConnection();

			String sqlQuery = "SELECT * FROM `User` WHERE Email = ? AND Password = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, email_input);
			preparedStatement.setString(2, password_input);

			ResultSet result = preparedStatement.executeQuery();

			while (result.next()) {
				String str = result.getString("Role");
				if (str.equalsIgnoreCase("Admin")) {
					System.out.println("Admin login Successfully");

				} else if (str.equalsIgnoreCase("User")) {
					System.out.println("User login Successfully");
				}
				int userID = result.getInt("UserID");
				String fullName = result.getString("FullName");
				String email = result.getString("Email");
				String password = result.getString("Password");
				Role role = Role.valueOf(result.getString("Role"));
				user = new User(userID, fullName, email, password, role);
			}

			return user;

		} finally {
			connection.close();
		}

	}

	public User createUsers(String fullName_input, String email_input) throws ClassNotFoundException, SQLException {
		try {
			User user = null;
			connection = jdbcUltils.getConnection();

			String sqlQuery1 = "INSERT INTO `User` (FullName, Email, Password, Role) VALUES (?, ?, ?, ?)";
			PreparedStatement preparedStatement1 = connection.prepareStatement(sqlQuery1);
			preparedStatement1.setString(1, fullName_input);
			preparedStatement1.setString(2, email_input);
			preparedStatement1.setString(3, "123456");
			preparedStatement1.setString(4, "User");
			preparedStatement1.executeUpdate();

			String sqlQuery2 = "SELECT * FROM `User` WHERE FullName = ? AND Email = ?";
			PreparedStatement preparedStatement2 = connection.prepareStatement(sqlQuery2);
			preparedStatement2.setString(1, fullName_input);
			preparedStatement2.setString(2, email_input);
			ResultSet result = preparedStatement2.executeQuery();
			while (result.next()) {
				int userID = result.getInt("UserID");
				String fullName = result.getString("FullName");
				String email = result.getString("Email");
				String password = result.getString("Password");
				Role role = Role.valueOf(result.getString("Role"));

				user = new User(userID, fullName, email, password, role);

			}
			return user;

		} finally {
			connection.close();
		}
	}
	
	public void deleteUserById(int id) throws ClassNotFoundException, SQLException {
		try {
			connection = jdbcUltils.getConnection();
			String sqlQuery = "DELETE FROM `User` WHERE UserID = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			
		} finally {
			connection.close();
		}
	}

}
