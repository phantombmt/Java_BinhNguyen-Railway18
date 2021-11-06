package com.vti.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {
	public static Scanner sc = new Scanner(System.in);

	public static int intputInt() {

		System.out.print("Nhap so nguyen : ");

		while (true) {
			try {
				int number = sc.nextInt();
				System.out.println(number);
				return number;

			} catch (InputMismatchException ime) {
				System.out.print("Nhap sai, nhap lai: ");
				sc.next();
			}
		}
	}

	public static int intputTongQuat() {

		System.out.print("Nhap so nguyen : ");
		while (true) {
			try {
				String input = sc.next();
				int number = Integer.parseInt(input);
				return number;

			} catch (Exception e) {
				System.out.print("Nhap sai, nhap lai: ");
			}
		}
	}
}
