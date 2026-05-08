package com.vaibhav;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        findErrorNums(arr);
    }
    static void findErrorNums(int[] arr) {
        int[] nums= new int[2];
        int i=0;
        while(i< arr.length){

            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else {
                i++;
            }
        }
        for(int j=0; j<arr.length;j++){
            if(arr[j]!=j+1){
                nums[0]=arr[j];
                nums[1]=j+1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}