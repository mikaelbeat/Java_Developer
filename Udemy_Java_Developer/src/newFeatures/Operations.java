package newFeatures;

public interface Operations {
	
	int sum(int x, int y);
	
	int GetX();
	
default	void Display(){
		System.out.println(GetX());
	}

}
