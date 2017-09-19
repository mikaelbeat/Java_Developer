package newFeatures;

public class mainClass {

	public static void main(String[] args) {
//		MyRunnable NewMyRunnable = new MyRunnable();
		Runnable NewMyRunnable = () -> {
			System.out.println("Thread is working.");
		};
		Thread t = new Thread(NewMyRunnable);
		t.start();

	}
	


}
