package com.rishi;

// To calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        int out = 1;
        while (n > 0) {
            out *= n;
            n--;
        }
        return out;
    }
}
