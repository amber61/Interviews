package ch3.additionsjava8;

import java.util.Comparator;

public class DuckHelper {

	public static int compareByWeight(Duck d1, Duck d2) {
		return d1.getWeight() - d2.getWeight();
	}

	public static int compareByName(Duck d1, Duck d2) {
		return d1.getName().compareTo(d2.getName());
	}

	public static void main(String[] args) {

		Comparator<Duck> byWeight = new Comparator<Duck>() {
			public int compare(Duck d1, Duck d2) {
				return DuckHelper.compareByWeight(d1, d2);
			}
		};

		// Comparator<Duck> byWeight1 = (d1, d2) ->
		// DuckHelper.compareByWeight(d1, d2);
		// Comparator<Duck> byWeight2 = DuckHelper::compareByWeight;
	}

}
