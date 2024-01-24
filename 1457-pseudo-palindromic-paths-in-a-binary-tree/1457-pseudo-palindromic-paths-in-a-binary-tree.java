/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int pseudoPalindromicPaths (TreeNode root) {
        return count(root, 0);
    }

    private int count(TreeNode root, int curr) {
        if (root == null) {
            return 0;
        }
        curr ^= 1 << root.val;
        if (isLeaf(root) && Integer.bitCount(curr) <= 1) {
            return 1;
        }
        return count(root.left, curr) + count(root.right, curr);
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}