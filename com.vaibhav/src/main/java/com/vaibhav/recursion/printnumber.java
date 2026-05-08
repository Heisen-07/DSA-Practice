package com.vaibhav.recursion;

public class printnumber {
    public static void main(String[] args) {
        int n=1;
        print1(n);
    }
    public static void print1(int n) {
        if(n<=5) {
            System.out.println(n);
            print1(n + 1);
        }
    }
}
