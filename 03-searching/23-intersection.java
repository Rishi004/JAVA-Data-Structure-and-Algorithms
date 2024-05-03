// (349)
// Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must be unique and you may return the result in any order.

// Array Intersection:
  // The intersection of two arrays is defined as the set of elements that are present in both arrays.

// Example 1:
  // Input: nums1 = [1,2,2,1], nums2 = [2,2]
  // Output: [2]
  
// Example 2:
  // Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
  // Output: [9,4]
  // Explanation: [4,9] is also accepted.


package com.rishi.searching;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int[] num1 = {4, 9, 5};
        int[] num2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersection(num1, num2)));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums1) set.add(num);
        for (int num : nums2) {
            if (set.contains(num)) {
                list.add(num);
                set.remove(num);
            }
        }

        int[] out = new int[list.size()];
        for (int i = 0; i < out.length; i++) {
            out[i] = list.get(i);
        }

        return out;
    }
}
