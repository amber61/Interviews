package ch3.exercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q24 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("lion");
		s.add("tiger");
		s.add("bear");
		s.forEach((t) -> t.toUpperCase());
		System.out.println(s);

		Map m = new HashMap();
		m.put(123, "456");
		m.put("abc", "def");
		System.out.println(m.containsKey(123));

	}

}
