package ch2.immutableobjects;

import java.util.List;

public final class AnimalBadExample {

	private final List<String> favoriteFoods;

	public AnimalBadExample(List<String> favoriteFoods) {
		if (favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = favoriteFoods;
	}

	public List<String> getFavoriteFoods() {
		return favoriteFoods;
	}
}
