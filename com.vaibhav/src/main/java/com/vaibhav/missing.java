package com.vaibhav;

import java.util.Arrays;

class missing {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        firstMissingPositive(arr);
    }

    static void firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {

                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                System.out.println(i+1);
            }
        }

        System.out.println(n+1);
    }
}