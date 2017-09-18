package collections;


import java.util.Iterator;
import java.util.LinkedList;

public class MyCollectionLink {

	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("Monkey");
		ls.add("Tiger");
		ls.add("Fish");
		
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
