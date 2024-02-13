// (1886)
// Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

// Example 1:
  // Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
  // Output: true
  // Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.

// Example 2:
  // Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
  // Output: false
  // Explanation: It is impossible to make mat equal to target by rotating mat.

// Example 3:
  // Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
  // Output: true
  // Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.

package com.rishi;

public class FindRotation {
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}},
                target = {{1, 0}, {0, 1}};
        System.out.println(findRotation(mat, target));
    }

    private static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        boolean r90 = true, r180 = true, r270 = true, r360 = true;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int curr = mat[row][col];
                r90 &= curr == target[n-1-col][row];
                r180 &= curr == target[n-1-row][n-1-col];
                r270 &= curr == target[col][n-1-row];
                r360 &= curr == target[row][col];
            }
        }
        return r90 || r180 || r270 || r360;
    }
}
