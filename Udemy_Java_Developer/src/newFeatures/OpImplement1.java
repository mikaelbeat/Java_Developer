package newFeatures;

public class OpImplement1 implements Operations{
int x = 10;
int y = 15;
	@Override
	public int sum(int x, int y){
		return x + y;
	}
	
	@Override
	public int GetX(){
		return x;
	}


	}


