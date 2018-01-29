package me.ggulmool.leetcode.a100;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SameTreeTest {

    private SameTree sameTree;
    private TreeNode source;
    private TreeNode target;

    @Before
    public void setUp() throws Exception {
        sameTree = new SameTree();
        source = new TreeNode(1);
        target = new TreeNode(1);
    }

    @Test
    public void sameTree_left_right_값_동일() throws Exception {
        // [1,2,3] / [1,2,3]
        source.left = new TreeNode(2);
        source.right = new TreeNode(3);
        target.left = new TreeNode(2);
        target.right = new TreeNode(3);
        assertTrue(sameTree.mySolution(source, target));
    }

    @Test
    public void sameTree_target_left값_null인경우() throws Exception {
        // [1,2] / [1,null,2]
        source.left = new TreeNode(2);
        target.right = new TreeNode(2);
        assertFalse(sameTree.mySolution(source, target));
    }

    @Test
    public void sameTree_left_right_다른경우() throws Exception {
        // [1,2,3] / [1,3,2]
        source.left = new TreeNode(2);
        source.right = new TreeNode(3);

        target.left = new TreeNode(3);
        target.right = new TreeNode(2);
        assertFalse(sameTree.mySolution(source, target));
    }

    @Test
    public void null_null() throws Exception {
        source = null;
        target = null;
        assertTrue(sameTree.mySolution(source, target));
    }

    @Test
    public void null_exist() throws Exception {
        source = null;
        target = new TreeNode(1);
        assertFalse(sameTree.mySolution(source, target));

        source = new TreeNode(1);
        target = null;
        assertFalse(sameTree.mySolution(source, target));
    }

    @Test
    public void null_case2() throws Exception {
        //[1,5,15]
        //[1,5,null,null,15]
        source.left = new TreeNode(5);
        source.right = new TreeNode(15);

        target.left = new TreeNode(5);
        target.right = null;
        target.left.left = null;
        target.left.right = new TreeNode(15);
        assertFalse(sameTree.mySolution(source, target));
    }

    @Test
    public void null_case3() throws Exception {
        //[1,null,4]
        //[1,3,4]
        source.left = null;
        source.right = new TreeNode(4);

        target.left = new TreeNode(3);
        target.right = new TreeNode(4);
        assertFalse(sameTree.mySolution(source, target));
    }
}
