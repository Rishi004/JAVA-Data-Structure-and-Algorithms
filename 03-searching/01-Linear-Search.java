// Linear Search - O(n)

package com.rishi.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 8, 23, 45, 67};
        int target = 4;
        System.out.println(linearSearch(nums, target));
    }

    static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
