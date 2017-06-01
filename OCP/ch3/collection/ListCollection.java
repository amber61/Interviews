package ch3.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			String string = (String) iter.next();
			System.out.println(string);
		}
	}

}
