package cars;

public class Car {
	
	String Type;
	int Model;
	double Price;
	double MilesDrive;
	static  String Owner;
	
	public Car(String Type, int Model, double Price, double MilesDrive){
		this.Type=Type;
		this.Model=Model;
		this.Price=Price;
		this.MilesDrive=MilesDrive;
		System.out.println("Contructor is created.");
	}
	
	public Car(){
		System.out.println("Constructor 2 is created.");
	}

	double GetPrice() {
		double NewPrice = Price-(MilesDrive*100);
		return NewPrice;
	}
	
	public static void Enter(){
		System.out.println("\n");
	}

}
