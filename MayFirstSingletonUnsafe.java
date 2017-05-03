
// Singleton concurrency issue
public class MayFirstSingletonUnsafe {

    private static MayFirstSingletonUnsafe singleThing;

    private MayFirstSingletonUnsafe() {
    }

    public static MayFirstSingletonUnsafe getInstance() {
	if (singleThing == null)
	    singleThing = new MayFirstSingletonUnsafe();
	return singleThing;
    }

    public static void main(String[] args) {
	MayFirstSingletonUnsafe thing = MayFirstSingletonUnsafe.getInstance();
    }
}
