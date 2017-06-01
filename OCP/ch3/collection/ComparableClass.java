package ch3.collection;

public class ComparableClass implements Comparable<ComparableClass> {

	String name;
	private int weight;

	public ComparableClass(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public String toString() {
		return name;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof ComparableClass)) {
			return false;
		}
		ComparableClass other = (ComparableClass) obj;
		return this.weight == other.weight;
	}

	@Override
	public int compareTo(ComparableClass obj) {
		return this.name.compareTo(obj.name);
	}

	public static void main(String[] args) {

	}

}
