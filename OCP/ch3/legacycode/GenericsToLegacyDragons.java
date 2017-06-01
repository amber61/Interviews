package ch3.legacycode;

import java.util.List;

public class GenericsToLegacyDragons {
	public static void main(String[] args) {
		java.util.List<Unicorn> unicorns = new java.util.ArrayList<>();
		addUnicorn(unicorns);
		Unicorn unicorn = unicorns.get(0);
	}

	private static void addUnicorn(List unicorn) {
		unicorn.add(new Dragon());
	}
}
