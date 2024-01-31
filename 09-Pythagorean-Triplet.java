// Pythagorean Triplet in an array.
// Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.
// GEEKSFORGEEKS -> https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/

// Example 1:
  // Input: arr[] = {3, 1, 4, 6, 5} 
  // Output: True 
  // There is a Pythagorean triplet (3, 4, 5).

// Example 2:
  // Input: arr[] = {10, 4, 6, 12, 5} 
  // Output: False 
  // There is no Pythagorean triplet. 

package com.rishi;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int[] numArr = {3, 1, 4, 6, 5};
        System.out.println(isPythagoreanTriplet(numArr));
    }

    private static boolean isPythagoreanTriplet(int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                for (int k = j + 1; k < numArr.length; k++) {
                    int x = numArr[i];
                    int y = numArr[j];
                    int z = numArr[k];
                    if ((x * x + y * y == z * z) || (x * x + z * z == y * y) || (y * y + z * z == x * x))
                        return true;
                }
            }
        }
        return false;
    }
}

