package leetcode;

//Reverse digits of an integer.
//
//Example1: x = 123, return 321
//Example2: x = -123, return -321
//
//Note:
//The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.

import java.util.Scanner;

public class Solution {
    StringBuilder str;

    public Solution() {
	str = new StringBuilder();
    }

    public int reverse(int x) {
	String s = x + "";
	try {
	    if (!isRange(x)) {
		return 0;
	    } else {
		if (x < 0) {
		    for (int i = 1; i < s.length(); i++) {
			str.append(s.substring(i, i + 1));
		    }
		    String s1 = str.append("-").reverse().toString();
		    if (isRange(Integer.parseInt(s1)))
			return Integer.parseInt(s1);
		    else
			return 0;
		} else {
		    for (int i = 0; i < s.length(); i++) {
			str.append(s.substring(i, i + 1));
		    }
		    String s2 = str.reverse().toString();
		    if (isRange(Integer.parseInt(s2)))
			return Integer.parseInt(s2);
		    else
			return 0;
		}
	    }
	} catch (NumberFormatException e) {
	    return 0;
	}
    }

    private boolean isRange(int x) {
	if (x <= Integer.MAX_VALUE && x >= Integer.MIN_VALUE) {
	    return true;
	} else {
	    return false;
	}
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String ss = input.nextLine();

	Solution s = new Solution();
	System.out.println(s.reverse(Integer.parseInt(ss)));

    }
}
