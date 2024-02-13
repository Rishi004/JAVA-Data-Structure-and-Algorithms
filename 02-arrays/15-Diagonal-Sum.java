// (1572)
// Given a square matrix mat, return the sum of the matrix diagonals.
// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

// Example 1:
  // Input: mat = [[1,2,3],
  //               [4,5,6],
  //               [7,8,9]]
  // Output: 25
  // Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
  // Notice that element mat[1][1] = 5 is counted only once.
  
// Example 2:
  // Input: mat = [[1,1,1,1],
  //               [1,1,1,1],
  //               [1,1,1,1],
  //               [1,1,1,1]]
  // Output: 8
  
// Example 3:
  // Input: mat = [[5]]
  // Output: 

package com.rishi;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        System.out.println(diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat) {
        int cen = mat.length / 2;
        int sum = primaryDiagonalSum(mat) + secondaryDiagonalSum(mat);
        if (mat.length == 1 && mat[0].length == 1) return mat[0][0];
        if (mat.length % 2 == 0) return sum;
        else return sum - mat[cen][cen];
    }

    static int primaryDiagonalSum(int[][] mat) {
        int pSum = 0;
        int row = 0, col = 0;
        while (row < mat.length && col < mat[0].length) {
            pSum += mat[row][col];
            row++;
            col++;
        }
        return pSum;
    }

    static int secondaryDiagonalSum(int[][] mat) {
        int sSum = 0;
        int row = 0, col = mat[0].length - 1;
        while (row < mat.length && col >= 0) {
            sSum += mat[row][col];
            row++;
            col--;
        }
        return sSum;
    }

}
