package me.ggulmool.leetcode.a001;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {

    public int[] mySolution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalStateException("found not exception");
    }

    public int[] otherSolution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complemnet = target - nums[i];
            if (map.containsKey(complemnet)) {
                return new int[]{map.get(complemnet), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalStateException("found not exception");
    }
}
