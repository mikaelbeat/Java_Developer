package mainPackage;

import java.util.Scanner;

public class SimpleIF {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter grade: ");
		int grade = reader.nextInt(); 
		
		if (grade>=90){
			System.out.println("Grade is  A.");
		}
		else if ((grade>=80) && (grade<90)) {
			System.out.println("Grade is B.");
		}
		else if ((grade>=70) && (grade<80)) {
			System.out.println("Grade is C.");
		}
		else if ((grade>=50) && (grade<70)) {
			System.out.println("Grade is D.");
		}
		else{
			System.out.println("Grade is failed.");
		}
		System.out.println("End of grading.");
		
		

	}

}
