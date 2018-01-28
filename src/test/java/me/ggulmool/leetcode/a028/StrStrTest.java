package me.ggulmool.leetcode.a028;

import static org.junit.Assert.assertEquals;

import me.ggulmool.leetcode.a028.StrStr;
import org.junit.Test;

public class StrStrTest {

  @Test
  public void strStr() {
      StrStr strStr = new StrStr();
      assertEquals(2, strStr.mySolution("tcab", "ab"));
      assertEquals(2, strStr.mySolution("hello", "ll"));
      assertEquals(0, strStr.mySolution("a", ""));

      assertEquals(2, strStr.otherSolution("tcab", "ab"));
      assertEquals(2, strStr.otherSolution("hello", "ll"));
      assertEquals(0, strStr.otherSolution("a", ""));
  }
}
