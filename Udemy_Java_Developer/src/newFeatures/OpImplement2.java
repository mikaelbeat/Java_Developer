package newFeatures;

public interface OpImplement2 implements Operations{
int x = 10;
int y = 15;

	@Override
	public int sum(int x, int y){
		return x+y+10;
	}
	
	@Override
	public int GetX(){
		return x;
	}
	
}
