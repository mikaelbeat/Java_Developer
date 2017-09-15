package threading;

public class MyThread extends Thread{

	boolean IsRunning=true;
	 String name;
	
	public MyThread(String name){
		this.name=name;
		System.out.println(name);
	}
	
	@Override
	public void run(){
		display();
	}
	
	
	
void display(){ // Shared method
		int count=0;
		while(count<10){
			count++;
			System.out.println(name+ ":" +count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
