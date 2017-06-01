package ch1.exercises;

public class Q8Outer {
	private int x = 5;

	protected class Inner {
		// member inner class cannot declare static
		// public static int x = 10;

		public void go() {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		Q8Outer out = new Q8Outer();
		Q8Outer.Inner in = out.new Inner();
		in.go();

	}

}
