package collections;

import java.util.ArrayList;

public class MyCollections {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Developer");
		ar.add("Tester");
		ar.add("Manager");
		
		for (String st: ar)
		System.out.println(st);
		
		// Array class
		ArrayList<employee> emp = new ArrayList<employee>();
		emp.add(new employee("Mark", 36));
		emp.add(new employee("Dave", 46));
		emp.add(new employee("Steve", 26));
		for (employee st: emp)
			System.out.println(st.name+" - "+ st.age);
	}
	
	static class employee{
		String name;
		int age;
		public employee(String name, int age){
			this.name=name;
			this.age=age;
		}
	}

}
