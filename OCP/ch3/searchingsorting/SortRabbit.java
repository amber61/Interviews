package ch3.searchingsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortRabbit {

	static class Rabbit {
		int id;
	}

	public static void main(String[] args) {
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit());

		Comparator<Rabbit> comp = new Comparator<Rabbit>() {
			public int compare(Rabbit b1, Rabbit b2) {
				return b1.id - b2.id;
			}
		};
		// Comparator<Rabbit> comp = (b1, b2) -> b1.id - b2.id;

		Collections.sort(rabbits, comp);

		List<String> names = Arrays.asList("Fluffy", "Hoppy");
		Comparator<String> c = Comparator.reverseOrder();
		// based on c reverseOrder to search
		// binary only work on ordered ds, names not reverorder
		int index = Collections.binarySearch(names, "Hoppy", c);
		System.out.println(index);
		// result is undefine, like -1
	}

}
