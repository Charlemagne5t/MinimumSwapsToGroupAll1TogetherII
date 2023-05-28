package org.example;

import java.util.Arrays;

public class Solution {
    public int minSwaps(int[] nums) {
        int n = 0;
        int[] nums2 = new int[nums.length * 2];
        for (int i = 0, j = 0; i < nums2.length; i++, j++) {
            if (j == nums.length) j = 0;
            n += nums[j];
            nums2[i] = nums[j];
        }
        n = n / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums2[i];
        }
        int zeroes = n - sum;
        int min = zeroes;

        for (int i = 0; i < nums2.length - n; i++) {
            if (nums2[i] == 0 && nums2[i + n] == 1) {
                zeroes--;
            } else if (nums2[i] == 1 && nums2[i + n] == 0) {
                zeroes++;
            }
            min = Math.min(min, zeroes);
        }
        return min;
    }
}
