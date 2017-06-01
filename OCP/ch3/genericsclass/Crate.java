package ch3.genericsclass;

public class Crate<T> {

	private T contents;

	private T emptyCrate() {
		return contents;
	}

	public void packCrate(T contents) {
		this.contents = contents;
	}

	public static void main(String[] args) {
		Crate<Elephant> crate = new Crate<>();
		Elephant e = new Elephant();
		crate.packCrate(e);
		Elephant em = crate.emptyCrate();
	}

}
