
public class FizzBuzz {

    public static String processFizzBuzzString(int n) {
	return n % 2 == 0 ? (n % 3 == 0 ? "FizzBuzz" : "Fizz") : (n % 3 == 0 ? "Buzz" : "" + n);
    }

    public static void main(String[] args) {
	int n = 0;
	StringBuilder str = new StringBuilder();
	String strings = "123456789";
	for (int i = 0; i < strings.length(); i++) {
	    n = Integer.parseInt(strings.charAt(i) + "");
	    str.append(processFizzBuzzString(n));
	}
	System.out.println(str.toString());
    }
}
