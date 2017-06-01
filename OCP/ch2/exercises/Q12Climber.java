package ch2.exercises;

public class Q12Climber {

	private static void check(Q12Climb climb, int height) {
		if (climb.isTooHigh(height, 10))
			System.out.println("too high");
		else
			System.out.println("ok");
	}

	public static void main(String[] args) {
		// check((h, l) -> h.toString(), 5); // error
	}
}
