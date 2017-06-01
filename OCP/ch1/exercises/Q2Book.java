package ch1.exercises;

import java.awt.print.Book;
import java.util.ArrayList;

public class Q2Book {
	private int ISBN;
	private String title, author;
	private int pageCount;

	public int hashCode() {
		return ISBN;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		return this.ISBN == other.UNKNOWN_NUMBER_OF_PAGES;
		// return this.ISBN == other.ISBN;
	}

	// imagine getters and setters are here
	public static void main(String[] args) {
		// Q3
		String s1 = "Canada";
		String s2 = new String(s1);
		ArrayList l = new ArrayList();
		if (s1 == s2)
			System.out.println("s1 == s2");
		if (s1.equals(s2))
			System.out.println("s1.equals(s2)");
		if (l.equals(s1)) {
		}
	}
}
