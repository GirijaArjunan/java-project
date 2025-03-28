package session7;

import java.util.*;

public class CollectionEx {
	
	//adding and accessing Elements in a collection
	
	public static void main(String[] args) {
		//list Example
		
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("python");
		list.add("Node");
		
		System.out.println("List: "+list);
		
		//set example
		
		Set<String> set = new HashSet<>();
		
		set.add("Ktm");
		set.add("Rc");
		set.add("Royal Enfield");
		
		System.out.println("Set: "+set);
		
		//map example
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Aashudas");
		map.put(2, "Hema");
		map.put(3, "Hemakumariii");
		
		System.out.println("Map: "+map);
				
				
	}

}
