package mainPackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyFile {
	
	static Scanner reader = new Scanner(System.in);
	static Scanner reader2 = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Press 1 to write, 2 to read or 3 to clear file.");
		int op = reader.nextInt();
		switch(op){
		case 1: // Write
			System.out.println("Enter to save to file");
			String text = reader2.nextLine();
			FileWriterOn(text);
			break;
		case 2: // Read
			FileReaderOn();
			break;
		case 3: // Clear file
			ClearFile();
			break;
		}
	}

	static void FileReaderOn() {
		try {
			FileReader fin = new FileReader("test.txt");
			int c;
			while ((c = fin.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
	}

	static void FileWriterOn(String str) {
		try {
			FileWriter fo = new FileWriter("test.txt", true);
			fo.write(str);
			fo.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	static void ClearFile() {
		try {
			PrintWriter clear = new PrintWriter("test.txt");
			clear.print("");
			clear.close();
		} catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
