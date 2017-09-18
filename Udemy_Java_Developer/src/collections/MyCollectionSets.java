package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class MyCollectionSets {

	public static void main(String[] args) {
		TreeSet<String> ls = new TreeSet<String>();
		ls.add("Monkey");
		ls.add("Tiger");
		ls.add("Fish");

		Iterator<String> itr = ls.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
