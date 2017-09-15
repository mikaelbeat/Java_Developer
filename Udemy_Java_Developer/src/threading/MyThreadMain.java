package threading;

public class MyThreadMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Threads is working.");
		MyThread Thread1=new MyThread("Thread 1: ");
		Thread1.start();
		MyThread Thread2=new MyThread("Thread 2: ");
		Thread2.start();
		Thread.sleep(6000);
		Thread1.IsRunning=false;
		System.out.println("Thread 1 went down..");
	}

}
