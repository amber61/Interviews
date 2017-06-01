package ch3.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		String food = map.get("koala");
		for (String key : map.values())
			System.out.print(key + ",");

		System.out.println();

		Map<String, String> map1 = new TreeMap<>();
		map1.put("koala", "bamboo");
		map1.put("lion", "meat");
		map1.put("giraffe", "leaf");
		String food1 = map1.get("koala");
		for (String key : map1.keySet())
			System.out.print(key + ",");

		System.out.println();

		System.out.println(map1.containsKey("lion"));
		System.out.println(map1.containsValue("lion"));
		System.out.println(map1.size());

	}

}
