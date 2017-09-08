package mainPackage;

public class StringFile {

	public static void main(String[] args) {
		
		String name = "Petri Ryynänen";
		
		System.out.println("Name lenght is: " + name.length());
		System.out.println("\nFirst character is: " + name.charAt(0));
		System.out.println("\nLast character is: " + name.charAt(name.length()-1));
		
		System.out.println("\nPrinting name is  for loop");
		System.out.println("\n");
		for(int i=0;i<name.length();i++)
			System.out.print(name.charAt(i));
		
		System.out.println("\n");
		
		for(int i=name.length()-1;i>=0;i--)
			System.out.print(name.charAt(i));

	}

}
