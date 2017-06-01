package ch3.bounds;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LowerBounded {

	public static long total(List<? super String> list) {
		return 0;

	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("zhe");
		System.out.println(list.get(0));
		total(list);

		// lower bounded special
		List<? super IOException> exceptions = new ArrayList<Exception>();
		// exceptions.add(new Exception());
		exceptions.add(new IOException());
		exceptions.add(new FileNotFoundException());

		List<? super String> e = new ArrayList<Object>();
		// e.add(new Object());

	}

}
