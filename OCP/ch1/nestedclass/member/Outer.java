package ch1.nestedclass.member;

public class Outer {

	private String greeting = "Hi";

	protected class Inner {
		public int repeat = 3;

		public void go() {
			for (int i = 0; i < repeat; i++)
				System.out.println(greeting);
		}
	}

	public void callInner() { // or called in main
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		// Inner inner = outer.callInner();
		outer.callInner();
	}

}
