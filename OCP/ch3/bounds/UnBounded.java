package ch3.bounds;

import java.util.ArrayList;
import java.util.List;

/**
 * !!!!!!Important comprehension. compile errors, exception, correct
 * 
 * @author huang
 *
 */
public class UnBounded {

	public static void printList(List<?> list) {
		for (Object x : list)
			System.out.println(x);
	}

	public static void main(String[] args) {
		// List<Integer> numbers = new ArrayList<>();
		// numbers.add(new Integer(42));
		// List<Object> objects = numbers;
		// List<Object> l = new ArrayList<String>();
		//
		// array external data type can be compile, but ArrayStoreException
		// Integer[] number1 = { new Integer(42) };
		// Object[] object1 = number1;
		// object1[0] = "forty two";

		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		printList(keywords);
	}

}
