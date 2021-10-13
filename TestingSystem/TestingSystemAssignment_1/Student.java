package VTI.edu.nguyen;

public class Student {
	double scoreMath;
	double scorePhysics;
	double scoreChemistry;


	public double scoreAvg() {

		return (scoreMath * 2 + scorePhysics + scoreChemistry) / 4;
	}

	public void academicAssessment1(double avgScore) {

		if (avgScore >= 9) {
			System.out.println("Xuat sac");
		} else if (8 <= avgScore && avgScore < 9) {
			System.out.println("Gioi");
		} else if (7 <= avgScore && avgScore < 8) {
			System.out.println("Kha");
		} else if (6 <= avgScore && avgScore < 7) {
			System.out.println("Trung binh kha");
		} else if (5 <= avgScore && avgScore < 6) {
			System.out.println("Trung binh");
		} else {
			System.out.println("Kem");
		}

	}
	
	public String academicAssessment2(double avgScore){
		String a ="";
		

		if (avgScore >= 9) {
			a= "Xuat sac";
		} else if (8 <= avgScore && avgScore < 9) {
			a = "Gioi";
		} else if (7 <= avgScore && avgScore < 8) {
			a = "Kha";
		} else if (6 <= avgScore && avgScore < 7) {
			a = "Trung binh kha";
		} else if (5 <= avgScore && avgScore < 6) {
			a = "Trung binh";
		} else {
			a = "Kem";
		}
		return a;
	}
}
