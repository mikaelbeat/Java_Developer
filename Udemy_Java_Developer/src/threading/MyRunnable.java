package threading;

public class MyRunnable implements Runnable{

		boolean IsRunning=true;
		String name;
		
		public MyRunnable(String name){
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
