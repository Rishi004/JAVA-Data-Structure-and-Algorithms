// (888)
// Alice and Bob have a different total number of candies.
// You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy 
// that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.

// Since they are friends, they would like to exchange one candy box each so that after the exchange, 
// they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.

// Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange,
// and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers,
// you may return any one of them. It is guaranteed that at least one answer exists.

// Example 1:
  // Input: aliceSizes = [1,1], bobSizes = [2,2]
  // Output: [1,2]

// Example 2:
  // Input: aliceSizes = [1,2], bobSizes = [2,3]
  // Output: [1,2]
  
// Example 3:
  // Input: aliceSizes = [2], bobSizes = [1,3]
  // Output: [2,3]


package com.rishi.searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FairCandyShop {
    public static void main(String[] args) {
        int[] aliceSizes = {1, 2};
        int[] bobSizes = {2, 3};
        System.out.println(
                Arrays.toString(fairCandySwap(aliceSizes, bobSizes))
        );
    }

    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0, sumBob = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int size : aliceSizes) {
            sumAlice += size;
        }
        for (int size : bobSizes) {
            sumBob += size;
            map.put(size, 1);
        }

        int avgDiff = (sumAlice - sumBob) / 2;

        for (int size: aliceSizes) {
            if (map.containsKey(size - avgDiff)) {
                return new int[] {size, size - avgDiff};
            }
        }

        return new int[] {-1, -1};

    }
}
