// Fibonacci series
// Find the nth element
// 0  1  1  2  3  5  8  13  21...


package com.rishi.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
