package com.vti.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {
	public static Scanner sc = new Scanner(System.in);
	public static String EMAIL_PATTERN = "^[a-z][\\w-.]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
	public static String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,12}$";

	public static int intputInt() {

		System.out.print("Enter number : ");

		while (true) {
			try {
				int number = sc.nextInt();
				System.out.println(number);
				return number;

			} catch (InputMismatchException ime) {
				System.err.print("Wrong input, re-enter the number: ");
				sc.next();
			}
		}
	}

	public static int intputTongQuat() {

		System.out.print("Enter number : ");
		while (true) {
			try {
				String input = sc.next();
				int number = Integer.parseInt(input);
				sc.nextLine();
				return number;

			} catch (Exception e) {
				System.err.print("Wrong input, re-enter the number: ");
			}
		}
	}

	public static String inputName() {
		System.out.print("Enter name : ");

		String name = sc.nextLine();
		// Trim the space head & end
		name = name.trim();
		// Trim space between
		name = name.replaceAll("\\s+", " ");
		// Convert to lower case:
		name = name.toLowerCase();
		// Split to each word by space
		String[] words = name.split(" ");
		// Upper Case the first character of each word
		name = "";
		for (String word : words) {
			word = word.substring(0, 1).toUpperCase() + word.substring(1, word.length());
			name = name + word + " ";
		}
		System.out.println(name);
		sc.nextLine();
		return name;
	}

	public static String inputEmail() {
		System.out.print("Enter email : ");
		while (true) {
			String text = sc.next();
			if (text.matches(EMAIL_PATTERN)) {
				sc.nextLine();
				return text;
			} else {
				System.err.print("You entered the wrong email format, re-enter it : ");
			}
		}
	}

	public static String inputPassword() {

		System.out.print("Enter password : ");
		while (true) {
			String text = sc.next();
//			System.out.println(Pattern.matches(PASSWORD_PATTERN, text));
			if (text.matches(PASSWORD_PATTERN)) {
//				System.out.println("You entered the correct format");
				sc.nextLine();
				return text;
			} else {
				System.err.print("Password must be from 6-12 characters long, must contain lowercase letters, "
						+ "uppercase letters,numbers and at least 1 special character!"
						+ "\nPlease re-enter password : ");
			}
		}

	}
}