// (350)
// Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

// Array Intersection:
  // The intersection of two arrays is defined as the set of elements that are present in both arrays.

// Example 1:
  // Input: nums1 = [1,2,2,1], nums2 = [2,2]
  // Output: [2,2]

// Example 2:
  // Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
  // Output: [4,9]
  // Explanation: [9,4] is also accepted.


package com.rishi.searching;

import java.util.*;

public class Intersection2 {
    public static void main(String[] args) {
        int[] num1 = {4, 9, 5};
        int[] num2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersect(num1, num2)));
    }

    static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] out = new int[list.size()];
        for (int i = 0; i < out.length; i++) {
            out[i] = list.get(i);
        }

        return out;
    }
}
