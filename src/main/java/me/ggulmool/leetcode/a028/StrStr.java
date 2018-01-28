package me.ggulmool.leetcode.a028;

/*
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
 */
public class StrStr {
    public int mySolution(String haystack, String needle) {
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();

        for (int i = 0; i < haystackChars.length; i++) {
            int k = i, j = 0;
            while (j < needleChars.length) {
                if (haystackChars[k] != needleChars[j]) {
                    break;
                }
                j++;
                k++;
            }
            if (j == needleChars.length) return i;
        }

        return -1;
        //return haystack.contains(needle) ? haystack.indexOf(needle) : -1;
    }

    public int otherSolution(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
}
