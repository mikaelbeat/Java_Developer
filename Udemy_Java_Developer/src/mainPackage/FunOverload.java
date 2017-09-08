package mainPackage;

public class FunOverload {

	float Sub(float n1, float n2){
		float r=n1-n2;
		return r;
	}
	
	float Sub(float n1, float n2, float n3){
		float r=n1-n2-n3;
		return r;
	}
	

	public static void main(String[] args) {
		float s1 = new FunOverload().Sub(10, 7);
		System.out.println("Sum 1 is: " + s1);		
		
		float s2 = new FunOverload().Sub(10, 7, 2);
		System.out.println("Sum 2 is: " + s2);

	}
	

	

}
