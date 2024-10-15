// *********
//  *******
//   *****
//    ***
//     *


package com.rishi.patterns;

public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            int maxCol = 2 * (n - row) + 1;
            for (int col = 1; col <= maxCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
