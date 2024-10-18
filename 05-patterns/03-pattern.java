// *****
// ****
// ***
// **
// *


package com.rishi.patterns;

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(5);
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            int maxCol = n - row + 1;
            for (int col = 1; col <= maxCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
