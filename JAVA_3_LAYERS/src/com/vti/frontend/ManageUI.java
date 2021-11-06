package com.vti.frontend;

import java.util.List;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

public class ManageUI {

	private String menuStr = "Chuc nang chinh cua chuong trinh: \n" + "0. Thoat chuong trinh \n"
			+ "1. Khoi tao du lieu \n" + "2. In danh sach users \n" + "3. In thong tin user theo ID \n"
			+ "4. Xoa account theo ID nhap vao \n" + "5. Login ";

	private UserController userController;

	public ManageUI() {
		userController = new UserController();
	}

	public String getMenuStr() {
		return menuStr;
	}

	public int inputFunction() {
		while (true) {
			// C1:
			int input1 = ScannerUtils.intputTongQuat();
			// C2:
//			int input2 = ScannerUtils.intputInt();

			// ----------------------------------
			if (0 <= input1 && input1 <= 5)
				return input1;
			else
				System.out.println("Nhap so tu 0 -> 5 , vui long nhap lai : ");
		}
	}

	public void showMenu(String menuStr) {
		System.out.println(menuStr);
		int inputChoosen = inputFunction();
		switch (inputChoosen) {
		case 0:
			System.out.println("Thoat chuong trinh...");
			break;
		case 1:
			System.out.println("Khoi tao du lieu...");
			break;
		case 2:
			System.out.println("In danh sach users...");
			displayUsersInfo();
			break;
		case 3:
			System.out.println("In thong tin user theo ID...");
			break;
		case 4:
			System.out.println("Xoa account theo ID nhap vao...");
			break;
		case 5:
			System.out.println("Login...");
			break;

		}
	}

	public void displayUsersInfo() {

		List<User> users = userController.getListUsersController();

		System.out.println("Printing......\n\n");
		System.out.println("------------------------------------------------------------------------");
		System.out.printf("%-5s%-25s%-20s%-15s%-15s", "ID", "Email", "Fullname", "Password", "Role");
		System.out.println("------------------------------------------------------------------------");
		for (User user : users) {
			System.out.printf("%-5d%-25s%-20s%-15s%-15s", user.getId(), user.getEmail(), user.getFullName(),
					user.getPassword(), user.getRole());
			System.out.println("------------------------------------------------------------------------");
		}

	}

}
