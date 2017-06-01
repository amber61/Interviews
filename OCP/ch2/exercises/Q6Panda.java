package ch2.exercises;

import java.util.function.Predicate;

public class Q6Panda {
	int age;

	private static void check(Q6Panda panda, Predicate<Q6Panda> pred) {
		String result = pred.test(panda) ? "match" : "not match";
		System.out.println(result);
	}

	public static void main(String[] args) {
		Q6Panda p1 = new Q6Panda();
		p1.age = 1;
		check(p1, p -> p.age < 5);

	}

}
