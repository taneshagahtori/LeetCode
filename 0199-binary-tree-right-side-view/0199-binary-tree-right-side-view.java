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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        rightView(root,list,0);
            return list;
    }
    static void rightView(TreeNode root, ArrayList<Integer>list, int level){
        if(root==null){
            return;
        }
        if(level==list.size()){
            list.add(root.val);
        }
        if(root.right!=null){
            rightView(root.right,list,level+1);
        }
        if(root.left!=null){
            rightView(root.left,list,level+1);
        }
    }
}