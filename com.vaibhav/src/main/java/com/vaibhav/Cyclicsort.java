package com.vaibhav;

import java.util.Arrays;

public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {0,3,2,1,4};
        int i=0;
        while(i< arr.length){
            int temp = arr[i];
            if (arr[i]==i){
                i++;
            }
            else {
                int t = arr[i];
                arr[i] = arr[temp];
                arr[temp] = t;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
