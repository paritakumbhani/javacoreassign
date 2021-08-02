package Assignment6;

import java.util.*;

public class Treemap {

	public static void main(String args[])
    {
		 // Map to store the elements
		TreeMap<Integer, String> treemap = new TreeMap<>();
		
		// Put elements to the map
		treemap.put(1, "Jack");
		treemap.put(2, "Rick");
		treemap.put(3, "Kate");
		treemap.put(4, "Tom");
		treemap.put(5, "Steve");
		
		// Getting all keys as Set object using descendingKeySet()
		Map<Integer, String> map = treemap.descendingMap();
		
		map.forEach((key,value) -> System.out.println(key + ": " + value));
    }
	
}
