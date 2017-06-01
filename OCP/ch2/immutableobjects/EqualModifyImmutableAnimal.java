package ch2.immutableobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EqualModifyImmutableAnimal {

	public static void main(String[] args) {
		AnimalGoodExample lion = new AnimalGoodExample("lion", 5, Arrays.asList("meat", "more meat"));

		List<String> favoriteFoods = new ArrayList<String>();
		for (int i = 0; i < lion.getFavoriteFoodsCount(); i++) {
			favoriteFoods.add(lion.getFavoriteFood(i));
		}

		// "Modifying immutable objects"
		AnimalGoodExample updatedLion = new AnimalGoodExample(lion.getSpecies(), lion.getAge(), favoriteFoods);
	}

}
