package collections;

import java.util.HashMap;
import java.util.Map;

public class MyCollectionHash {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Cat");
		map.put(2, "Dog");
		map.put(3, "Snake");
		System.out.println(map.get(3));
		System.out.println("");
		for(Map.Entry m:map.entrySet()){
			System.out.println("Key: "+m.getKey()+", value: "+ m.getValue());
		}
		System.out.println("");
		map.put(1, "Cat Update");
		map.put(2, "Dog Update");
		map.put(3, "Snake Udate");
		for(Map.Entry m:map.entrySet()){
			System.out.println("Key: "+m.getKey()+", value: "+ m.getValue());
		}
		System.out.println("");
		map.remove(1);
		map.remove(2);
		map.remove(3);
		for(Map.Entry m:map.entrySet()){
			System.out.println("Key: " +m.getKey()+", value: "+m.getValue());
		}
		
	}

}
