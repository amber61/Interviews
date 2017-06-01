package ch2.singleton;

public class Single1 {

	private static final Single1 thing = new Single1();

	private Single1() {}

	public static Single1 getInstance() {
		return thing;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
