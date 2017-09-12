package mainPackage;

public class StudentsMain {
	public static void main(String[] args){
		Students st = new Students("Petri", Gender.Male);
		System.out.println("Name: " + st.FirstName);
		System.out.println("Gender: " + st.gender);
	}

}
