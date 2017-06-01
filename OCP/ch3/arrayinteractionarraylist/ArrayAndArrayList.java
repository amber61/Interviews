package ch3.arrayinteractionarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayAndArrayList {

	public static void main(String[] args) {
		String[] array = { "gerbil", "mouse" };
		List<String> list = Arrays.asList(array);
		list.set(1, "test");
		array[0] = "new";
		// String[] array2 = (String[]) list.toArray();// or the next line
		String[] array2 = list.toArray(new String[0]);
		// list.remove(1);// throws UnsupportedOperationException

		int[] numbers = { 6, 9, 1, 8 };
		Arrays.sort(numbers); // sorting from small to big
		System.out.println(Arrays.binarySearch(numbers, 6));
		System.out.println(Arrays.binarySearch(numbers, 3));

		List<Integer> list1 = Arrays.asList(9, 7, 5, 3);
		Collections.sort(list1);
		System.out.println(Collections.binarySearch(list1, 3));
		System.out.println(Collections.binarySearch(list1, 2));

		List<Integer> numbers1 = new ArrayList<>();
		numbers1.add(1);
		numbers1.add(new Integer(3));
		numbers1.add(new Integer(5));
		numbers1.remove(1);
		numbers1.remove(new Integer(5));
		System.out.println(numbers1);
	}

}
