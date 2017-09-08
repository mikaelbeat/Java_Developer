package mainPackage;

public class Simple_Function {
	


	public static void main(String[] args) {

		new Simple_Function().Draw();
		System.out.println("\n");
		float r=new Simple_Function().Sum(5, 5);
		System.out.println("Sum is: "+ r);
		float x=new Simple_Function().Sum(20, 30);
		System.out.println("Sum is: "+ x);
		
	}
	
	
	
	void Draw() {
	for (int i=0;i<10;i++)
	{
		System.out.println("*");
		for (int j=i;j>=0;j--)
			System.out.print("-");
	}
	}
	
	float Sum(float n1, float n2) {
		float sum=n1+n2;
		return sum;
	}
	
}
