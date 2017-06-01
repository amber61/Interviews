package ch2.singleton;

public class Single3 {

	private static Single3 thing;

	private Single3() {}

	public static Single3 getInstance() {
		if (thing == null)
			thing = new Single3();
		return thing;
	}

}
