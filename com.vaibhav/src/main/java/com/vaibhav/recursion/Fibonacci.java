package com.vaibhav.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int result = numb(n);
        System.out.println(result);
    }

    public static int numb(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return numb(n - 1) + numb(n - 2);
    }
}