package ch1.exercises;

public class Q20FourLegged {
	String walk = "walk,";

	static class BabyRhino extends Q20FourLegged {
		String walk = "toddle,";
	}

	public static void main(String[] args) {
		Q20FourLegged f = new BabyRhino();
		BabyRhino b = new BabyRhino();
		System.out.println(f.walk);
		System.out.println(b.walk);
	}

}
