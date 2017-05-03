
import java.util.Scanner;

public class ReverseWord {

    private StringBuilder str;

    public ReverseWord() {
	str = new StringBuilder();
    }

    public String reverseWords(String s) {
	for (int i = 0; i < s.length(); i++) {
	    str.append(s.substring(i, i + 1));
	}
	return str.reverse().toString();
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter a word: ");
	String strings = input.nextLine();

	ReverseWord r = new ReverseWord();
	System.out.println("The reversed word is: " + r.reverseWords(strings));

    }

}
