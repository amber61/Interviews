package ch2.facotory;

public class Pellets extends Food {

	public Pellets(int quantity) {
		super(quantity);
	}

	@Override
	public void consumed() {
		System.out.println("Pellets eaten: " + getQuantity());
	}

}
