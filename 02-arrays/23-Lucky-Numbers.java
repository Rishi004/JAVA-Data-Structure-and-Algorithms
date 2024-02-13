// (1380)
// Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
// A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

// Example 1:
  // Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
  // Output: [15]
  // Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
  
// Example 2:
  // Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
  // Output: [12]
  // Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
  
// Example 3:
  // Input: matrix = [[7,8],[1,2]]
  // Output: [7]
  // Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.

package com.rishi;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 6},
                {7, 1},
                {5, 2},
                {4, 8}
        };
        System.out.println(luckyNumbers(matrix));
    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minInd = minInd(matrix, i);
            int luckyNum = matrix[i][minInd];

            if (checkIsMax(matrix, minInd, luckyNum)) out.add(luckyNum);
        }
        return out;
    }

    static int minInd(int[][] matrix, int i) {
        int j = 0;
        int minInd = 0;
        int min = matrix[i][j];
        for (j = 1; j < matrix[0].length; j++) {
            if (matrix[i][j] < min) {
                min = matrix[i][j];
                minInd = j;
            }
        }
        return minInd;
    }

    static boolean checkIsMax(int[][] matrix, int j, int luckyNum) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > luckyNum) return false;
            }
        return true;
    }
}
