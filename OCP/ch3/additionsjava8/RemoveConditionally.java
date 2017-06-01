package ch3.additionsjava8;

import java.util.Arrays;
import java.util.List;

public class RemoveConditionally {

	public static void main(String[] args) {
		// 2. remove conditionally
		// List<String> list = new ArrayList<>();
		// list.add("Magician");
		// list.add("Assistant");
		// System.out.println(list);
		// list.removeIf(s -> s.startsWith("A"));
		// System.out.println(list);

		// 3. updating all elements
		// List<Integer> list = Arrays.asList(1, 2, 3);
		// list.replaceAll(x -> x * 2);
		// System.out.println(list);

		// 4. looping a collection
		List<String> cats = Arrays.asList("Annie", "Ripley");
		// cats.forEach(c -> System.out.println(c));
		cats.forEach(System.out::println);
	}

}
