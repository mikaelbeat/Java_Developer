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
		int count=0;
		while(IsRunning){
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
