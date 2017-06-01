package ch2.builder;

import java.util.Arrays;
import java.util.List;

import ch2.immutableobjects.AnimalGoodExample;

public class AnimalBuilder {
	private String species;
	private int age;
	private List<String> favoriteFoods;

	public AnimalBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	public AnimalBuilder setSpecies(String species) {
		this.species = species;
		return this;
	}

	public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
		this.favoriteFoods = favoriteFoods;
		return this;
	}

	public AnimalGoodExample build() {
		return new AnimalGoodExample(species, age, favoriteFoods);
	}

	public static void main(String[] args) {
		AnimalBuilder duckBuilder = new AnimalBuilder();
		duckBuilder.setSpecies("duck").setAge(4).setFavoriteFoods(Arrays.asList("grass", "fish"));
		AnimalGoodExample duck = duckBuilder.build();

		AnimalGoodExample flamingo = new AnimalBuilder().setSpecies("flamingo")
				.setFavoriteFoods(Arrays.asList("algae", "insects")).build();

	}

}
