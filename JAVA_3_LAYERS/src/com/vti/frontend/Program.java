package com.vti.frontend;

public class Program {
	public static void main(String[] args) {
		System.out.println("Buoi 13 nao cac ban!");
		System.out.println("------------------------------\n");

		// Control UI from frontend
		ManageUI manageUI = new ManageUI();
		
		//Show menu and choose function
		manageUI.showMenu(manageUI.getMenuStr());

	}
}
