package ch3.exercises;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 14. C. This question is hard because it defines both Comparable and
 * Comparator on the same object. t1 doesn’t specify a Comparator so it uses the
 * Comparable object’s compareTo() method. This sorts by the text instance
 * variable. t2 did specify a Comparator when calling the constructor, so it
 * uses the compare() method, which sorts by the int.
 */
public class Q14Sorted implements Comparable<Q14Sorted>, Comparator<Q14Sorted> {
	private int num;
	private String text;

	Q14Sorted(int n, String t) {
		this.num = n;
		this.text = t;
	}

	public String toString() {
		return "" + num;
	}

	public int compareTo(Q14Sorted s) {
		return text.compareTo(s.text);
	}

	public int compare(Q14Sorted s1, Q14Sorted s2) {
		return s1.num - s2.num;
	}

	public static void main(String[] args) {
		Q14Sorted s1 = new Q14Sorted(88, "a");
		Q14Sorted s2 = new Q14Sorted(55, "b");
		TreeSet<Q14Sorted> t1 = new TreeSet<>();
		t1.add(s1);
		t1.add(s2);
		TreeSet<Q14Sorted> t2 = new TreeSet<>(s1);
		t2.add(s1);
		t2.add(s2);
		System.out.println(t1 + "" + t2);
	}
}
