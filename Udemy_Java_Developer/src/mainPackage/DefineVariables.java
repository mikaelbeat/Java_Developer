package mainPackage;

public class DefineVariables {
	
	private float sum(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		
		float r = new DefineVariables().sum(9,9);
		System.out.println("Sum is: "+ r);
		int sum=0; // Global variable
		for(int i=0;i<10;i++) {
			sum=i; // local variable
		}
		System.out.println(sum);

	}



}
