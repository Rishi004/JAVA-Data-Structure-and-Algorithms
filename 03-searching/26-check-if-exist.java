// (1346)
// Given an array arr of integers, check if there exist two indices i and j such that :
  // i != j
  // 0 <= i, j < arr.length
  // arr[i] == 2 * arr[j]

// Example 1:
  // Input: arr = [10,2,5,3]
  // Output: true
  // Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
  
// Example 2:
  // Input: arr = [3,1,7,11]
  // Output: false
  // Explanation: There is no i and j that satisfy the conditions.


// ===================== SOLUTION - 01 ===================== 
package com.rishi.searching;

import java.util.HashMap;
import java.util.Map;

public class CheckIfExist {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] * 2) && i != map.get(arr[i] * 2)) {
                return true;
            }
        }

        return false;
    }
}


// ===================== SOLUTION - 02 ===================== 
package com.rishi.searching;

public class CheckIfExist {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] * 2 && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}

