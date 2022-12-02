package map_programs;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap_Program1 {

	public static void main(String[] args) {
		TreeMap<Integer,Object> map = new TreeMap<>();
		
		map.put(20, "yash");
		map.put(46, "appu");
		map.put(50, "darshan");
		map.put(125, "shivanna");
		map.put(22, "raghanna");
		map.put(30, "ganesh");
		map.put(25, "duniya");
		map.put(15, "daali");
		map.put(51, "sudeep");
		map.put(4, "dhruva");
		map.put(10, "chethan");
		
		//null key and values are not allowed
//		map.put(null, "prathap");
//		map.put(30, null);
//		map.put(70, null);
		
		System.out.println(map);
		
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get(50));
		System.out.println(map.containsKey(4));
		System.out.println(map.containsKey(500));
		System.out.println(map.containsValue("yash"));
		System.out.println(map.containsValue("prathap"));
		System.out.println(map.putIfAbsent(70, "ramcharan"));
		System.out.println(map.replace(4, "chiru"));
		System.out.println(map.replace(22, "muruli"));
		
		System.out.println(map.size());
		
		System.out.println();
		
		for (  Entry<Integer, Object> lv : map.entrySet()) {
			System.out.println(lv.getValue()+"="+lv.getKey());
		}
	}
}
