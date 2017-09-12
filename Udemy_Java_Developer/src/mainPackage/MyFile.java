package mainPackage;

import java.io.FileWriter;

public class MyFile {

	public static void main(String[] args) {
		
		try{
		FileWriter fo = new FileWriter("test.txt");
		fo.write("Welcome to new Java file.");
		fo.close();}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
