package ch3.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q15 {

	public static void main(String[] args) {
		// Comparator<Integer> c = (o1, o2) -> o2 - o1;
		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}

		};
		List<Integer> list = Arrays.asList(5, 4, 7, 1);
		Collections.sort(list, c);
		System.out.println(Collections.binarySearch(list, 1));

	}

}
