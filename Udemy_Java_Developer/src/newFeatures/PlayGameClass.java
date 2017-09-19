package newFeatures;

public class PlayGameClass {

	public static void main(String[] args) {

		// Lambda expression
		PlayGame MyPlayGame = (x,y)->{
			System.out.println("Game is on.");
			System.out.println("X: "+x);
			System.out.println("Y: "+y);
		};
		MyPlayGame.play(3,7);
	}
	
//	// Without lambda
//	MyPlayGameClass MyClassInstance = new MyPlayGameClass();
//	MyClassInstance.play();
//	
//static	class MyPlayGameClass implements PlayGame{
//		public void play(){
//			System.out.println("Game is on without Lambda.");
//		}
//
//		@Override
//		public void play(int x, int y) {
//			// TODO Auto-generated method stub
//			
//		}
//	}

}
