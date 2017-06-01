package ch3.exercises;

public class Q6Hello<T> {

	T t;

	public Q6Hello(T t) {
		this.t = t;
	}

	public String toString() {
		return t.toString();
	}

	public static void main(String[] args) {
		System.out.println(new Q6Hello<String>("hi"));
		System.out.println(new Q6Hello("hi"));
	}

}
