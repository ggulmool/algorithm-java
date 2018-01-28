package me.ggulmool.leetcode.a007;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {
    @Test
    public void reverseIntegerTest() {
        ReverseInteger reverseInteger = new ReverseInteger();
        assertEquals(321, reverseInteger.mySolution(123));
        assertEquals(21, reverseInteger.mySolution(120));
        assertEquals(-321, reverseInteger.mySolution(-123));
        assertEquals(0, reverseInteger.mySolution(0));
        assertEquals(0, reverseInteger.mySolution(1534236469));
    }
}
