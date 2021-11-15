package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		ManageUI manageUI = new ManageUI();
		manageUI.showMenu(manageUI.getMenuStr());		
	}
}
