// (238)
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.

// Example 1:
  // Input: nums = [1,2,3,4]
  // Output: [24,12,8,6]
  
// Example 2:
  // Input: nums = [-1,1,0,-3,3]
  // Output: [0,0,9,0,0]

// Constraints:
  // 2 <= nums.length <= 105
  // -30 <= nums[i] <= 30
  // The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

package com.rishi;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] products = new int[n];
        Arrays.fill(products, 1);

        int currProd = 1;
        for (int i = 0; i < n; i++) {
            products[i] *= currProd;
            currProd *= nums[i];
        }

        currProd = 1;
        for (int i = n - 1; i >= 0; i--) {
            products[i] *= currProd;
            currProd *= nums[i];
        }

        return products;
    }
}
