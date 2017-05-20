package leetcode;

/**
 * Given a non-empty array of integers, return the third maximum number in this array. 
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

	public int thirdMax(int[] nums) {
		List<Integer> list = new ArrayList<>(3);
		list.add(nums[0]);

		for (int i = 1; i < nums.length; i++) {
			int current = nums[i];

			if (list.size() == 3) {
				if (current > list.get(0) && current != list.get(1) && current != list.get(2)) {
					list.set(0, current);
					Collections.sort(list);
				}
				continue;
			} // list size is 3

			if (list.size() == 1) {
				if (list.get(0) != current) { // sorting from s to b
					list.add(current);
					Collections.sort(list);
				}
				continue;
			} // list size is 1

			if (list.size() == 2) {
				if (!(current == list.get(0) || current == list.get(1))) {
					list.add(current);
					Collections.sort(list);
				}
				continue;
			} // list size is 2

		} // end of for

		if (list.size() == 1)
			return list.get(0);
		else if (list.size() == 2)
			return list.get(1);
		else
			return list.get(0);
	}
}
