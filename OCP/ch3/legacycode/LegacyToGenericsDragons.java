package ch3.legacycode;

import java.util.ArrayList;
import java.util.List;

public class LegacyToGenericsDragons {
	public static void main(String[] args) {
		List unicorns = new ArrayList();
		unicorns.add(new Unicorn());
		printDragons(unicorns);
	}

	private static void printDragons(List<Dragon> dragons) {
		for (Dragon dragon : dragons) { // ClassCastException
			System.out.println(dragon);
		}
	}
}
