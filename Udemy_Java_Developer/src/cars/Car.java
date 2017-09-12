package cars;

// Abstract class can only be accessed be inheritance.

public class Car {
	
public	String Type;
public	int Model;
public	double Price;
public	double MilesDrive;
public	static  String Owner;
Owners owners;
	
	public Car(String Type, int Model, double Price, double MilesDrive){
		this.Type=Type;
		this.Model=Model;
		this.Price=Price;
		this.MilesDrive=MilesDrive;
		System.out.println("Contructor is created.");
		owners = new Owners();
		owners.FirstName="Petri";
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
