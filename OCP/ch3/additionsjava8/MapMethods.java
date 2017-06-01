package ch3.additionsjava8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapMethods {

	public static void main(String[] args) {
		// Map<String, String> f = new HashMap<>();
		// f.put("Jenny", "Bus Tour");
		// f.put("Tom", null);
		//
		// f.putIfAbsent("Jenny", "Tram");
		// f.putIfAbsent("Sam", "Tram");
		// f.putIfAbsent("Tom", "Tram");
		// System.out.println(f);
		// //{Tom=Tram, Jenny=Bus Tour, Sam=Tram}

		// BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() >
		// v2.length() ? v1 : v2;
		// Map<String, String> f1 = new HashMap<>();
		// f1.put("Jenny", "Bus Tour");
		// f1.put("Tom", "Tram");
		// f1.put("Sam", null);
		// String jenny = f1.merge("Jenny", "Skyride", mapper);
		// String tom = f1.merge("Tom", "Skyride", mapper);
		// String sam = f1.merge("Sam", "Skyride", mapper);
		//
		// System.out.println(f1); // {Tom=Skyride, Jenny=Bus Tour, Sam=Skyride}
		// System.out.println(jenny);// Bus Tour
		// System.out.println(tom);// Skyride
		// System.out.println(sam);// Skyride

		BiFunction<String, String, String> mapper = (v1, v2) -> null;
		Map<String, String> f2 = new HashMap<>();
		f2.put("Jenny", "Bus Tour");
		f2.put("Tom", "Bus Tour");

		f2.merge("Jenny", "Skyride", mapper);
		f2.merge("Sam", "Skyride", mapper);

		System.out.println(f2); // {Tom=Bus Tour, Sam=Skyride}, Jenny removed
	}

}
