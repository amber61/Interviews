package ch1.exercises;

public class Q6FlavorsEnum {
	enum Flavors {
		VANILLA, CHOCOLATE, STRAWBERRY
	}

	public static void main(String[] args) {
		System.out.println(Flavors.CHOCOLATE.ordinal());

		Flavors f = Flavors.STRAWBERRY;
		// switch (f) {
		// case 0:
		// System.out.println("vanilla");
		// case 1:
		// System.out.println("chocolate");
		// case 2:
		// System.out.println("strawberry");
		// default:
		// System.out.println("missing flavors");
		// }
	}

}
