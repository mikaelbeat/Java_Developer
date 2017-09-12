package cars;

public class Casting {

	public static void main(String[] args) {
		CarTruck.Owner="Smith";
		CarTruck cartruck=new CarTruck();
		cartruck.Model=2016;
		cartruck.SetHasTruck(true);
		cartruck.MilesDrive=100;
		cartruck.Price=23330;
		cartruck.Type="GSM";

		Car mycar=(Car) cartruck;
		System.out.println(mycar.MilesDrive);
	}

}
