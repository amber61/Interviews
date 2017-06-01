package ch1.nestedclass.staticclass;

public class Enclosing {
	private int number = 10;

	static class Nested {
		private int price = 6; // why static can define non-static

		public void printNum() {
			System.out.println(new Enclosing().number);
		}
	}

	public static void main(String[] args) {
		Enclosing.Nested nested = new Enclosing.Nested();
		System.out.println(nested.price);
	}

}
