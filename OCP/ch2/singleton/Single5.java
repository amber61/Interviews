package ch2.singleton;

public class Single5 {

	private static volatile Single5 thing;

	private Single5() {}

	public static Single5 getInstance() {
		if (thing == null) {
			synchronized (Single5.class) {
				if (thing == null) {
					thing = new Single5();
				}
			}
		}
		return thing;
	}
}
