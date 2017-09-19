package newFeatures;

public interface Operations {
	
	int sum(int x, int y);
	
	int GetX();
	
// When using default method every method is different method from original method.
default	void Display(){
		System.out.println("X is: "+GetX());
	}


// When using static method this same method is shared.
static void DisplayY(){
	System.out.println("");
	System.out.println("Hello from static method.");
}

}
