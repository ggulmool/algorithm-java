package me.ggulmool.leetcode.a100;

/*
Given two binary trees, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:
Input:     1         1
          / \       / \
         2   3     2   3
        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2
        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2
        [1,2,1],   [1,1,2]

Output: false
 */
public class SameTree {

    public boolean mySolution(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        boolean left = mySolution(p.left, q.left);
        boolean right = mySolution(p.right, q.right);

        return p.val == q.val && left && right;
    }

    public boolean otherSolution(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q; // if they are null at the same time
        if (p.val != q.val) return false;
        return otherSolution(p.right, q.right) && otherSolution(p.left, q.left);
    }
}