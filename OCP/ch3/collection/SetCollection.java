package ch3.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		boolean b1 = set1.add(66);
		boolean b2 = set1.add(10);
		boolean b3 = set1.add(66);
		boolean b4 = set1.add(8);

		for (Integer s : set1) {
			System.out.print(s + ",");
		}

		System.out.println();

		Set<Integer> set2 = new TreeSet<>();
		boolean b5 = set2.add(66);
		boolean b6 = set2.add(10);
		boolean b7 = set2.add(66);
		boolean b8 = set2.add(8);

		for (Integer s : set2) {
			System.out.print(s + ",");
		}
	}

}
