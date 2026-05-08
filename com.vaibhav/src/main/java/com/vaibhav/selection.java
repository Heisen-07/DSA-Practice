package com.vaibhav;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {3,-6,7,3,9};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void select(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
           int max=getmax(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getmax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start+1; i <= end; i++) {
            if (arr[i]>arr[max]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
