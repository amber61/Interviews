package ch3.exercises;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q7 {

	public static void main(String[] args) {
		Set<Number> numbers = new HashSet<>();
		numbers.add(new Integer(86));
		numbers.add(75);
		numbers.addAll(null);
		numbers.add(309L);
		Iterator iter = numbers.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());

	}

}
