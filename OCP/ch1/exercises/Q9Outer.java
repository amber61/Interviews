package ch1.exercises;

public class Q9Outer {
	private int x = 24;

	public int getX() {
		String message = "x is ";

		class Inner {
			private int x = Q9Outer.this.x;

			public void printX() {
				System.out.println(message + x);
			}
		}
		Inner in = new Inner();
		in.printX();
		return x; // Inner x
	}

	public static void main(String[] args) {
		new Q9Outer().getX();
	}
}
