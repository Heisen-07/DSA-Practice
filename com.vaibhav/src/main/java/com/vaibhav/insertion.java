package com.vaibhav;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {1,4,8,6,0};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insert(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = true;
            for(int j = i+1; j>0; j--) {
                if (arr[j-1]>arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = false;
                }
                else if (flag) {
                    break;
                }
            }

        }
    }
}
