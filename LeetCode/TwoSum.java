//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//Tips: Array definition, constant can only be used in initializers; 
//	return statement position, be careful no return in else;

public class Solution {
    int[] indice;
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indice = new int[]{i, j};
                    //return indice; 
                    break;
                }
            }
        }
        return indice;
    }
}
