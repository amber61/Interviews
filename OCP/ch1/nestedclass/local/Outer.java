package ch1.nestedclass.local;

public class Outer {

	private int length = 5;

	public void calculate() {
		int width = 20;
		class Inner { // local inner class
			public void multiply() {
				System.out.println(length);
			}
		} // end of inner class
		Inner inner = new Inner();
		inner.multiply();

		width = 25; // not effective final even after inner class
	} // end of calculate method

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.calculate();
	}

}
