package mainPackage;

import java.util.Calendar;
import java.util.Scanner;

public class MyAge {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter date of birth: ");
		int DOB=reader.nextInt();
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int age = year-DOB;
		System.out.println("You are is " + age + " years old.");
		
		

	}

}
