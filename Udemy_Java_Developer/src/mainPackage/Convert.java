package mainPackage;

public class Convert {

	public static void main(String[] args) {
		
		int age = 36;
		double salary = 3.5;
		boolean isTrue=false;
		String rate = "3.5";
		
		String NewAge = String.valueOf(salary);
		String NewSalary = String.valueOf(age);
		String NewIsTrue = String.valueOf(isTrue);
		
		int Newrate = Integer.parseInt(rate);
		int Newsalary = (int) salary;
		
		double newrate = Double.parseDouble(rate);
		double NewAgeDouble = (double) age;
	}

}
