package mainPackage;

public class FunPlimre {

	double div(double n1, double n2){
		double r=n1/n2;
		return r;
	}
	
	double div(int n1, int n2){
		double r=n1/n2;
		return r;
	}
	
	double div(int n1, double n2){
		double r=n1*n2;
		return r;
	}
	
	
	
	
	public static void main(String[] args) {
		double r=new FunPlimre().div(10, 5);
		System.out.println("Result is: " + r);

		r=new FunPlimre().div(10, 5);
		System.out.println("Result is: " + r);
		
		r=new FunPlimre().div(10, 5.5);
		System.out.println("Result is: " + r);
	}

}
