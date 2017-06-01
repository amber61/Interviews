package ch2.singleton;

public class Single2 {

	private static final Single2 thing;

	static {
		thing = new Single2();
	}

	private Single2() {}

	public static Single2 getInstance() {
		return thing;
	}

}
