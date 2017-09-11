package cars;

public class CarMain {

	public static void main(String[] args) {
		
		
		Car.Owner="Smith";
		Car car1 = new Car("BMW",2016,10000,5);
		double price=car1.GetPrice();
		System.out.println("Car type is: "+car1.Type);
		System.out.println("Owner of the car is: "+car1.Owner);
		System.out.println("Car BMW price is: " +  price);
		
		Car.Enter();
		
		Car car2 = new Car();
		car2.Type="Ferrari";
		car2.Model=2015;
		car2.Price=100000;
		car2.MilesDrive=20;
		car2.Owner="Dimitri";
		System.out.println("Car type is: "+car2.Type);
		System.out.println("Owner of the car is: "+car2.Owner);
		System.out.println("Car Ferrari price is: " +  price);
		
		
	}

}
