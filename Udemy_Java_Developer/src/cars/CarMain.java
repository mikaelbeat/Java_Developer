package cars;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.Type="BMW";
		car1.Model=2016;
		car1.Price=10000;
		car1.MilesDrive=5;
		System.out.println("Car BMW price is: " +  car1.GetPrice());
		
		Car car2 = new Car();
		car2.Type="Ferari";
		car2.Model=2017;
		car2.Price=100000;
		car2.MilesDrive=60;
		System.out.println("Car Ferrari price is: " +  car2.GetPrice());
		
		
	}

}
