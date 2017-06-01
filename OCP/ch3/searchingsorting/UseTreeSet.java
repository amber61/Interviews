package ch3.searchingsorting;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {

	static class Rabbit {
		int id;
	}

	public static void main(String[] args) {

		// Sorting not check at compile time
		Set<Duck> ducks = new TreeSet<>();
		ducks.add(new Duck("Puddles", 5));
		// Duck implements Comparable

		Set<Rabbit> rabbits = new TreeSet<>(new Comparator<Rabbit>() {
			public int compare(Rabbit r1, Rabbit r2) {
				return r1.id - r2.id;
			}
		});
		// Set<Rabbit> rabbits = new TreeSet<>((r1, r2) -> r1.id - r2.id);
	}

}
