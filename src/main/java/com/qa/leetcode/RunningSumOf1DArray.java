package com.qa.leetcode;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        runningSum(nums);
        runningSumAlternateSolution(nums);
    }

    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        res[0] = nums[0];
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] + nums[i]; // nums[i-1] not because we also need to include the current element
            // and its not a case like product or sum of others except self
        }
        System.out.println(Arrays.toString(res));
        return res;

    }

    public static int[] runningSumAlternateSolution(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        System.out.println("Alternate solution "+Arrays.toString(nums));
        return nums;

    }
}

