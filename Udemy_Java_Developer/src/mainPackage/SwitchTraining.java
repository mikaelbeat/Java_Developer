package mainPackage;

import java.util.Scanner;

public class SwitchTraining {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter index: ");
		int index = reader.nextInt();
		
		switch(index) {
		case  1: System.out.println("he is male.");
		break;
		case 2: System.out.println("she is female.");
		break;
		default:
			System.out.println("unknown.");
		break;
		}
	}
}
