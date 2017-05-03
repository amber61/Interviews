
// Lazy way, but safe way
public class MayFirstSingleton {

    private static MayFirstSingleton singleThing = new MayFirstSingleton();

    private MayFirstSingleton() {
    }

    public static MayFirstSingleton getInstance() {
	return singleThing;
    }

    public static void main(String[] args) {
	MayFirstSingleton thing1 = MayFirstSingleton.getInstance();
    }
}
