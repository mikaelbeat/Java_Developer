package mainPackage;

import java.util.Scanner;

public class Inputs {

	static Scanner reader = new Scanner(System.in);
	static Scanner reader1 = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter name:");
		String name = reader.nextLine();
		System.out.print("Enter age:");
		int age = reader.nextInt();
		System.out.print("Enter salary:");
		double Salary = reader.nextDouble();
		System.out.print("Enter gender:");
		String input = reader1.nextLine();
		char Gender = input.charAt(0);
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: "+ Salary);
		System.out.println("Gender: " + Gender);
		
		

	}

}
