package com.vaibhav;

import java.util.Arrays;

public class concatarray {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        getConcatenation(nums);
    }
        static void getConcatenation(int[] nums) {
            int n= nums.length;
            int[] ans= new int[2*n];
            int i=0;
            while(i<2*n){
                 if(i>=n) {
                     ans[i] = nums[i - n];
                     i++;
                 }
                 else {
                     ans[i] = nums[i];
                     i++;
                 }

            }
            System.out.println(Arrays.toString(ans));
        }
}
