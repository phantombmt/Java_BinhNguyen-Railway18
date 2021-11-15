package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

public class ManageUI {

	private String menuStr = "Main function of the program: \n" + "0. Exit the program \n" + "1. Initialize data \n"
			+ "2. Print a list of users \n" + "3. Print user's information by ID \n"
			+ "4. Delete account according to ID entered \n" + "5. Login\n" + "6. Create user by Admin";

	private UserController userController;

	public ManageUI() throws FileNotFoundException, IOException {
		userController = new UserController();
	}

	public String getMenuStr() {
		return menuStr;
	}

	public int inputFunction() {
		while (true) {
			// C1:
			int input = ScannerUtils.intputTongQuat();
			// C2:
//			int input = ScannerUtils.intputInt();

			// ----------------------------------
			if (0 <= input && input <= 6)
				return input;
			else
				System.err.println("Enter number 0 -> 6 , please enter again : ");
		}
	}

	public void showMenu(String menuStr) throws ClassNotFoundException, SQLException {
		System.out.println(menuStr);
		int inputChoosen = inputFunction();
		switch (inputChoosen) {
		case 0:
			System.out.println("***********************Exit the program***********************");
			System.out.println("Done");
			System.exit(0);
			break;
		case 1:
			System.out.println("***********************Initialize data!***********************");
			usersInit();
			break;
		case 2:
			System.out.println("***********************Print a list of users!***********************");
			getUsersInfo();
			break;
		case 3:
			System.out.println("***********************Print user's information by ID!***********************");
			getUserInfoById();
			break;
		case 4:
			System.out.println("***********************Delete account according to ID entered!***********************");
			deleteUserById();
			break;
		case 5:
			System.out.println("***********************Login!***********************");
			getUserLogin();
			break;
		case 6:
			System.out.println("***********************Create user by Admin!***********************");
			createUsersByAdmin();
		}
	}

	// 1
	public void usersInit() throws ClassNotFoundException, SQLException {
		List<User> users = userController.getListUsers();
		System.out.println("Users's info from database: ");
		for(User user: users) {
			System.out.println(user);
		}
	}

	// 2--------
	public void getUsersInfo() throws ClassNotFoundException, SQLException {

		List<User> users = userController.getListUsers();

		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("%-5s%-25s%-28s%-15s%-15s", "ID", "Email", "Fullname", "Password", "Role");
		System.out.println("--------------------------------------------------------------------------------");
		for (User user : users) {
			System.out.printf("%-5d%-25s%-28s%-15s%-15s", user.getId(), user.getEmail(), user.getFullName(),
					user.getPassword(), user.getRole());
			System.out.println("--------------------------------------------------------------------------------");
		}
	}

	// 3
	public void getUserInfoById() throws SQLException, ClassNotFoundException {

		int id = ScannerUtils.intputTongQuat();
		User user = userController.getUserById(id);

		if (user == null) {
			System.err.println("ID number does not match. Try again!");
			return;
		}

		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("%-5s%-25s%-28s%-15s%-15s", "ID", "Email", "Fullname", "Password", "Role");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("%-5d%-25s%-28s%-15s%-15s", user.getId(), user.getEmail(), user.getFullName(),
				user.getPassword(), user.getRole());
		System.out.println("--------------------------------------------------------------------------------");

	}

	// 4
	public void deleteUserById() throws ClassNotFoundException, SQLException {
		int id = ScannerUtils.intputTongQuat();
		User user = userController.getUserById(id);

		if (user == null) {
			System.err.println("ID number does not match. Try again!");

		} else {
				userController.deleteUserById(id);
				System.out.println("Deleted!");
		}
	}

	// 5
	public void getUserLogin() throws ClassNotFoundException, SQLException {

		String email = ScannerUtils.inputEmail();
		String password = ScannerUtils.inputPassword();

		User user = userController.getUserLogin(email, password);
		if (user == null) {
			System.err.println("Email or password does not match. Try again!");
			return;
		}

		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("%-5s%-25s%-28s%-15s%-15s", "ID", "Email", "Fullname", "Password", "Role");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("%-5d%-25s%-28s%-15s%-15s", user.getId(), user.getEmail(), user.getFullName(),
				user.getPassword(), user.getRole());
		System.out.println("--------------------------------------------------------------------------------");

	}

	// 6
	public void createUsersByAdmin() throws ClassNotFoundException, SQLException {
		String email = ScannerUtils.inputEmail();
		String password = ScannerUtils.inputPassword();

		User user = userController.getUserLogin(email, password);
		if (user == null) {
			System.err.println("Email or password does not match. Try again!");
			return;
		} else if (user.getRole().toString().equalsIgnoreCase("Admin")) {
			String fullNameSetbyAdmin = ScannerUtils.inputName();
			String emailSetByAdmin = ScannerUtils.inputEmail();
			User newUser = userController.createUsers(fullNameSetbyAdmin, emailSetByAdmin);
			System.out.println("Created!");
			System.out.println("Your new User: ");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.printf("%-5s%-25s%-28s%-15s%-15s", "ID", "Email", "Fullname", "Password", "Role");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.printf("%-5d%-25s%-28s%-15s%-15s", newUser.getId(), newUser.getEmail(), newUser.getFullName(),
					newUser.getPassword(), newUser.getRole());
			System.out.println("--------------------------------------------------------------------------------");
		} else {
			System.err.println("You're not an Admin. Try again!");
		}
	}
}
