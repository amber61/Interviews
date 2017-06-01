package ch2.facotory;

public class FoodFactory {
	public static Food getFood(String animalName) {
		switch (animalName) {
			case "zebra":
				return new Hay(100);
			case "rabbit":
				return new Pellets(5);
			case "goat":
				return new Pellets(30);
			case "polar bear":
				return new Fish(10);
			// default:
		}
		throw new UnsupportedOperationException("Unsupported animal: " + animalName);
	}
}
