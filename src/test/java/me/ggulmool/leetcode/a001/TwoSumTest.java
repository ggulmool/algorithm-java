package me.ggulmool.leetcode.a001;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

  @Test
  public void TwoSumTest() {
      TwoSum twoSum = new TwoSum();
      assertArrayEquals(new int[]{1, 2}, twoSum.mySolution(new int[]{3, 2, 4}, 6));
      assertArrayEquals(new int[]{0, 1}, twoSum.otherSolution(new int[]{2, 7, 11, 15}, 9));
  }
}
