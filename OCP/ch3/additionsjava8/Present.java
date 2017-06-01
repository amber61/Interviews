package ch3.additionsjava8;

import java.util.HashMap;
import java.util.Map;

public class Present {

	public static void main(String[] args) {
		// Map<String, Integer> map = new HashMap<>();
		// map.put("Jenny", 1);
		// map.put("Tom", null);
		//
		// BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
		// Integer jenny = map.computeIfPresent("Jenny", mapper);
		// Integer sam = map.computeIfPresent("Sam", mapper);
		// Integer tom = map.computeIfPresent("Tom", mapper);
		//
		// System.out.println(map); //{Tom=null, Jenny=2}
		// System.out.println(jenny);//2
		// System.out.println(sam);//null
		// System.out.println(tom);//null

		// Map<String, Integer> map = new HashMap<>();
		// map.put("Jenny", 15);
		// map.put("Tom", null);
		//
		// Function<String, Integer> mapper = (k) -> 1;
		// Integer jenny = map.computeIfAbsent("Jenny", mapper);
		// Integer sam = map.computeIfAbsent("Sam", mapper);
		// Integer tom = map.computeIfAbsent("Tom", mapper);
		//
		// System.out.println(map); //{Tom=1, Jenny=15, Sam=1}

		Map<String, Integer> map = new HashMap<>();
		map.put("huang", null);
		map.put("zhe", 1);
		map.merge("huang", 2, (v1, v2) -> null);

		System.out.println(map);// {Sam=1}

	}

}
