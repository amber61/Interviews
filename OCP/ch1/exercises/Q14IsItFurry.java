package ch1.exercises;

import java.util.ArrayList;

public class Q14IsItFurry {
	static class Chipmunk {}

	public static void main(String[] args) {
		Chipmunk c = new Chipmunk();
		Object o = new Object();
		ArrayList<Chipmunk> l = new ArrayList<>();
		Runnable r = new Thread();
		int result = 0;
		if (c instanceof Chipmunk)
			result += 1;
		// if (l instanceof Chipmunk)
		// result += 2;
		if (o instanceof Chipmunk)
			result += 3;
		if (r instanceof Chipmunk)
			result += 4;
		System.out.println(result);

	}

}
