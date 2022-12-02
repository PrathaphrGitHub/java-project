package map_programs;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMap_Program2 {

	public static void main(String[] args) {
		TreeMap<String,Integer> map = new TreeMap<>();
		
		map.put("yash",20);
		map.put("appu",30);
		map.put("darshan",40);
		map.put("shivanna",70);
		map.put("raghanna",60);
		map.put("ganesh",45);
		map.put("duniya",35);
		map.put("daali",21);
		map.put("sudeep",13);
		map.put("dhruva",2);
		map.put("chethan",17);
		
		//null key and values are not allowed
//		map.put(null, "prathap");
//		map.put(30, null);
//		map.put(70, null);
		
		System.out.println(map);
		
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.containsKey("prathap"));
		System.out.println(map.containsKey("hi"));
		System.out.println(map.containsValue("yash"));
		System.out.println(map.containsValue("prathap"));
		
		System.out.println(map.size());
		
		System.out.println();
		
		for (  Entry<String, Integer> lv : map.entrySet()) {
			System.out.println(lv.getValue()+"="+lv.getKey());
		}
	}
}
