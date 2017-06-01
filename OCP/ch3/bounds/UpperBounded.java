package ch3.bounds;

import java.util.ArrayList;
import java.util.List;

public class UpperBounded {
	public static long total(List<? extends Number> list) {
		long count = 0;
		for (Number number : list)
			count += number.longValue();
		return count;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		total(list);

		List<? extends Number> number = new ArrayList<Number>();
		// number.add(5);
	}
}
