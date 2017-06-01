package ch2.singleton;

public class Single4 {

	private static Single4 thing;

	private Single4() {}

	public static synchronized Single4 getInstance() {
		if (thing == null)
			thing = new Single4();
		return thing;
	}

}
