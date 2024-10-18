// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *


package com.rishi.patterns;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = 1; row <= n - 1; row++) {
            int maxCol = n - row;
            for (int col = 1; col <= maxCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
