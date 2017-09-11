package cars;

public class CarTruck extends Car{
	
	private boolean HasTruck;
	void SetHasTruck(boolean HasTruck){
		this.HasTruck=HasTruck;
	}

	void GetOwner(){
		System.out.println("Owner: "+Owner);
		System.out.println("Price using super is: " + super.GetPrice());
	}
	
	@Override
	double GetPrice() {
		// Different content
		double NewPrice = Price-(MilesDrive*50);
		return NewPrice;
	}

}
