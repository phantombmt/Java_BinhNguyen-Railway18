package VTI.edu.nguyen;

import java.util.Scanner;

public class Exercise_1 {

	static Scanner scanner = new Scanner(System.in);

	// Question 1:
//	Viết chương trình nhập vào một số thực. Đơn vị tính cho số này là centimet (cm).
//	Hãy in ra số tương đương tính bằng foot (số thực, có 2 số lẻ thập phân) và inch (số thực, có 2 số lẻ thập phân).
//	Với 1 inch = 2.54 cm và 1 foot = 12 inches.

	public void calculatorQ1() {
		System.out.print("Type your number of cm : ");
		double x = scanner.nextDouble();
		double a = (x / 2.45) / 12; // Foot
		double b = x / 2.45; // Inch
		System.out.printf(x + "cm equal to %.2f foot\n", a);
		System.out.printf(x + "cm equal to %.2f inch\n", b);
	}

	// Question 2:
//	Viết chương trình nhập vào số giây từ 0 tới 68399, 
	// đổi số giây này thành dạng [giờ:phút:giây],
	// mỗi thành phần là một số nguyên có 2 chữ số.
//	Ví dụ: 02:11:05

	public void convertTime() {

		System.out.printf("Type your seconds : ");
		int seconds_in = scanner.nextInt();
		while (seconds_in > 68339 || seconds_in < 0) {
			System.err.print("Out of range [0:68339]\n" + "Try again :");
			seconds_in = scanner.nextInt();
		}
		;

		int hours = seconds_in / 3600;
		int minutes = (seconds_in % 3600) / 60;
		int seconds = (seconds_in % 3600) % 60;
		System.out.printf("Converted seconds to\n" + "hours:minutes:seconds" + "\n%02d:%02d:%02d", hours, minutes,
				seconds);

	}

	// Question 3:
//	Viết chương trình nhập vào 4 số nguyên. 
//	Hiển thị ra số lớn nhất và nhỏ nhất
	public void getMax() {
		int max = 0;

		int[] arr = new int[4];
		System.out.println("Type 4 int :");
		for (int i = 0; i < 4; i++) {
			System.out.print("Number " + (i + 1) + " = ");
			arr[i] = scanner.nextInt();

		}

		for (int i = 0; i < 4; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int min = max;

		for (int i = 0; i < 4; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max is " + max);
		System.out.println("Min is " + min);

	}

	// Question 4:
//	Nhập vào hai số tự nhiên a và b. Tính hiệu của hai số đó.
//	Nếu hiệu số lớn hơn 0 thì in ra dòng chữ 
	// [Số thứ nhất lớn hơn số thứ hai].
//	Nếu hiệu số nhỏ hơn 0 thì in ra dòng chữ 
	// [Số thứ nhất nhỏ hơn số thứ hai].

	public void checkNum() {
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();

		int x = a - b;
		if (x < 0) {
			System.out.println("a<b");
		} else {
			System.out.println("a>b");
		}

	}

	// Question 5:
//	Nhập vào 2 số tự nhiên a và b. 
//	Kiểm tra xem a có chia hết cho b không

	public void checkDivisible() {
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		if (a % b == 0) {
			System.out.println(a + " is divisible by " + b);
		} else {
			System.err.println(a + " is not divisible by " + b);
		}

	}

	// Question 6 :
	// Viết Chương trình:
//	a. Nhập vào điểm 3 môn học
//	b. Tính điểm trung bình
//	c. Xác định học lực của học sinh dựa trên điểm trung bình 
	// d. Hiển thị học lực của học sinh

	public void checkPoint() {

		// Instance of class Student :
		Student student = new Student();

		// ////////////////////
		System.out.print("Point of Math : ");
		student.scoreMath = scanner.nextDouble();

		System.out.print("Point of Physics : ");
		student.scorePhysics = scanner.nextDouble();
		
		System.out.print("Point of Chemistry : ");
		student.scoreChemistry = scanner.nextDouble();

		System.out.println("The average score is " + student.scoreAvg());

		// Use void :
		student.academicAssessment1(student.scoreAvg());

		// Use String return :

		System.out.println(student.academicAssessment2(student.scoreAvg()));

	}

	public static void main(String[] args) {

		Exercise_1 ex1 = new Exercise_1();

//		ex1.calculatorQ1();
//		ex1.convertTime();
//		ex1.getMax();
//		ex1.checkNum();
//		ex1.checkDivisible();
		ex1.checkPoint();

	}

}
