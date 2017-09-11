package mainPackage;

public class InnerClass {
	
static	class Animal{
		String Name;
		String Voice;
	}

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.Name="Monkey";
		animal.Voice="Hehe";
		System.out.println(animal.Name);
		System.out.println(animal.Voice);
	}
	
	void call(){

	}

}
