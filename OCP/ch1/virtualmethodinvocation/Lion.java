package ch1.virtualmethodinvocation;

public class Lion extends Animal {

    public String name = "Leo";

    public void play() {
	System.out.println("toss in meat");
    }

    public static void main(String[] args) {
	Animal animal = new Lion();
	animal.careFor();
	System.out.println(animal.name);
    }
}
