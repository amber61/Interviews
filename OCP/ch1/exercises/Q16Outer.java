package ch1.exercises;

public class Q16Outer {
	class Inner {}

	public static void main(String[] args) {
		Inner in = new Q16Outer().new Inner();

	}

}
