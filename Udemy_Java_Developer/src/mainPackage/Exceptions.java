package mainPackage;

import java.util.Scanner;

public class Exceptions {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		try{
			System.out.print("Give number to print: ");
			int x = reader.nextInt();
			System.out.println("Number you gave was: " + x);
		}
		catch(Exception ex){
			System.out.println("Error, you didn't give number.");
		}
		

	}

}
