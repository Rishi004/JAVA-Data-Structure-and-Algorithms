// *********
//  *     *
//   *   *
//    * *
//     *


package com.rishi.patterns;

public class Pattern14 {
    public static void main(String[] args) {
        pattern14(5);
    }

    static void pattern14(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            int maxCol = 2 * (n - row) + 1;
            for (int col = 1; col <= maxCol; col++) {
                if (row == 1 || col == 1 || col == maxCol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
