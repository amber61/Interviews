package leetcode;

public class Solution {

    public static int reverse(int x) {
	long inputNumber = x;
	long reversedNumber = 0;

	while (inputNumber != 0) {
	    reversedNumber = reversedNumber * 10 + inputNumber % 10;
	    inputNumber = inputNumber / 10;
	}

	if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE)
	    return 0;
	else
	    return (int) reversedNumber;
    }

    public static void main(String[] args) {
	System.out.println(reverse(12));
    }
}
