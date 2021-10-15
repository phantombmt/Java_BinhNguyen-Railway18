package VTI.edu.nguyen;

import java.util.Scanner;

public class Exercise_3 {

	// Question 1: Sử dụng for, while, do while để cho ra kết quả a, b, c, d như ảnh
//////////////////////////////////////////////////////
	public static void picA() {
		String[][] arr = new String[8][8];

		System.out.println("\nPicture a\n ");
		int i, j;

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < i + 1; j++) {
				arr[i][j] = "#";
			}
		}

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {

				if (arr[i][j] == null)
					arr[i][j] = " ";

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

//////////////////////////////////////////////////////
	public static void picB() {
		String[][] arr = new String[8][8];

		System.out.println("\nPicture b\n ");
		int i, j;

		for (i = 0; i < arr.length; i++) {
			for (j = (arr.length - 1) - i; j >= 0; j--) {

				arr[i][j] = "#";
			}
		}

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {

				if (arr[i][j] == null)
					arr[i][j] = " ";

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

//////////////////////////////////////////////////////
	public static void picC() {
		String[][] arr = new String[8][8];

		System.out.println("\nPicture c\n ");
		int i, j;

		for (i = 0; i < arr.length; i++) {
			for (j = i; j < arr.length; j++) {
				arr[i][j] = "#";
			}
		}

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {

				if (arr[i][j] == null)
					arr[i][j] = " ";

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

//////////////////////////////////////////////////////
	public static void picD() {
		String[][] arr = new String[8][8];

		System.out.println("\nPicture d\n ");

		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				arr[i][j] = "#";
			}
		}

		for (i = 0; i < arr.length; i++) {
			for (j = arr.length - 2 - i; j >= 0; j--) {
				arr[i][j] = " ";
			}
		}

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

//	Question 2:
//		Viết chương trình tính n! với n là số tự nhiên không âm nhập vào từ bàn phím. 
//		Trong đó: 0! = 1 n! = 1.2.3...n

//////////////////////////////////////////////////////
	public static int getFactorial(int n) {

		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		return n * getFactorial(n - 1);
	}

//////////////////////////////////////////////////////
	public static void main(String[] args) {
		System.out.println("******************   Question 1   ****************** ");
		picA();
		picB();
		picC();
		picD();

		System.out.println("******************   Question 2   ****************** ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println("n! = " + getFactorial(n));
	}
}
