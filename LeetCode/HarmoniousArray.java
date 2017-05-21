package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * We define a harmonious array is an array where the difference between its
 * maximum value and its minimum value is exactly 1.
 * 
 * Now, given an integer array, you need to find the length of its longest
 * harmonious subsequence among all its possible subsequences.
 * 
 * @author huang
 *
 */
public class S1 {

	public static int findLHS(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int counter = 1;
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], counter);
			} else {
				int value = map.get(nums[i]);
				map.put(nums[i], ++value);
			}
		}
		int max = 0;
		int sum = 0;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (map.containsKey(entry.getKey() + 1)) {
				max = Math.max(max, entry.getValue() + map.getOrDefault(entry.getKey() + 1, 0));
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 2, 5, 2, 3, 7 };
		int n = findLHS(arr);
		System.out.println(n);

	}

}
