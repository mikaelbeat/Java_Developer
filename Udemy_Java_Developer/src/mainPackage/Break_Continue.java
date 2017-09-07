package mainPackage;

public class Break_Continue {

	public static void main(String[] args) {
		for (int i=1;i<10;i++)
		{
			if(i % 2==0)
				//continue;
				break;
			System.out.println("Count is "+i);
		}

	}

}
