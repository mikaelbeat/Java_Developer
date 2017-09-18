package threading;

public class Deadlock {

	public static void main(String[] args) {
		
		final String Passenger1="Passenger1";
		final String Passenger2="Passenger2";
		Thread bus1=new Thread(){
			@Override
			public void run(){
				synchronized (Passenger1){
					System.out.println("Bus 1 is locked passenger 1.");
					try{
					Thread.sleep(1000);
					}catch(Exception ex){}
					synchronized (Passenger2) {
						System.out.println("Bus 1 is locked passenger 2.");
					}
				}
			}
		};
				
		Thread bus2=new Thread(){
			@Override
			public void run(){
				synchronized (Passenger2){
					System.out.println("Bus 1 is locked passenger 2.");
					try{
					Thread.sleep(1000);
					}catch(Exception ex){}
					synchronized (Passenger1) {
						System.out.println("Bus 1 is locked passenger 1.");
					}
				}
			}
		};
		
		bus1.start();
		bus2.start();
		
	}

}
