package ch3.exercises;

import java.io.FileNotFoundException;

public class Q12Helper {

	public static <U extends Exception> void printException(U u) {
		System.out.println(u.getMessage());
	}

	public static void main(String[] args) {
		Q12Helper.<NullPointerException>printException(new NullPointerException("A"));
		Q12Helper.printException(new FileNotFoundException("A"));
		Q12Helper.printException(new Exception("A"));

	}

}
