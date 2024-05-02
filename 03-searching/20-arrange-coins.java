// (441)
// You have n coins and you want to build a staircase with these coins.
// The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
// Given the integer n, return the number of complete rows of the staircase you will build.
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

  // *
  // * *
  // * * _

  // Input: n = 5
  // Output: 2
  // Explanation: Because the 3rd row is incomplete, we return 2.
  
// Example 2:

  // *
  // * *
  // * * *
  // * * _ _

  // Input: n = 8
  // Output: 3
  // Explanation: Because the 4th row is incomplete, we return 3.



package com.rishi.searching;

public class ArrangeCoins {
    public static void main(String[] args) {
        int n = 1804289383;
        System.out.println(arrangeCoins(n));
    }

    static int arrangeCoins(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long coins = (long) mid * (mid + 1) / 2;

            if (coins == n) return mid;
            else if (coins < n) start = mid + 1;
            else end = mid - 1;
        }
        return end;
    }
}
