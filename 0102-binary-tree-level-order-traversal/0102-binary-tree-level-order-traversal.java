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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue <TreeNode> queue= new LinkedList<TreeNode>();
        List<List<Integer>> list= new LinkedList<List<Integer>>();
        if (root==null){
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int s=queue.size();
            List<Integer> l=new LinkedList<Integer>();
            for(int i=0; i<s; i++){
                if(queue.peek().left!=null){
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right!=null){
                    queue.add(queue.peek().right);
                }
                l.add(queue.poll().val);
            }
            list.add(l);
        }
        return list;
    }
}