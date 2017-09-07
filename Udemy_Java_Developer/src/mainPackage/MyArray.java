package mainPackage;

import java.util.Scanner;

public class MyArray {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		String[] jobs = new String[5];
		
//		jobs[0]="Developer";
//		jobs[1]="Tester";
//		jobs[2]="QA";
//		jobs[3]="Manager";
//		jobs[4]="Admin";
		
		
		System.out.print("Enter jobs: ");
		for(int i=0;i<5;i++)
			jobs[i]=reader.nextLine();
		
		
		for(int i=0;i<5;i++) {
			System.out.println("Jobs are: " + jobs[i]);
		}

	}

}
