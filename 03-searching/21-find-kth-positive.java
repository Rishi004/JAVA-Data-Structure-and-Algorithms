// (1539)
// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
// Return the kth positive integer that is missing from this array.
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
  // Input: arr = [2,3,4,7,11], k = 5
  // Output: 9
  // Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
  
// Example 2:
  // Input: arr = [1,2,3,4], k = 2
  // Output: 6
  // Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.


package com.rishi.searching;

public class FindKthPositive {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int miss = arr[mid] - (mid + 1);

            if (miss < k) start = mid + 1;
            else end = mid - 1;
        }

        return end + 1 + k;
    }

}
