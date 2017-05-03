
import java.util.Scanner;

// Factorial using loop and iteration
public class MayFirst {

    public int factorialIteration(int n) {
	if (n == 0 || n == 1)
	    return 1;
	else
	    return n * factorialIteration(n - 1);
    }

    public int factorialLoop(int n) {
	int multiplication = 1;

	if (n == 0)
	    return 1;
	else {
	    for (int i = 1; i <= n; i++) {
		multiplication *= i;
	    }
	    return multiplication;
	}
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	do {
	    System.out.print("Please input a int number for calculating factorial: ");
	    int user = input.nextInt();

	    MayFirst f = new MayFirst();
	    int result1 = f.factorialIteration(user);
	    int result2 = f.factorialLoop(user);

	    System.out.println(
		    "The factorial results using the iteration and loop are: " + result1 + " and " + result2 + "\n");
	} while (true);

    }
}
