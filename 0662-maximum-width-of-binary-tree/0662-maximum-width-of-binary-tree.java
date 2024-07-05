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
class Pair{
    TreeNode node;
    int num;
    public Pair(TreeNode node, int num){
        this.node=node;
        this.num=num;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue <Pair> queue=new LinkedList<>();
        if (root==null){
            return 0;
        }
        int ans=0;
        queue.add(new Pair(root,0));
        while(!queue.isEmpty()){
            int size=queue.size();
            int mmin=queue.peek().num;
            int first=0;
            int last=0;
            for(int i=0 ;i<size; i++){
                int id=queue.peek().num-mmin;
                TreeNode node= queue.peek().node;
                queue.poll();
                if(i==0){
                    first=id;
                }
                if(i==size-1){
                    last=id;
                }
                if(node.left!=null){
                    queue.add(new Pair(node.left, id*2+1));
                }
                if(node.right!=null){
                    queue.add(new Pair(node.right, id*2+2));
                }
            }
            ans= Math.max(ans, last-first+1);
        }
        return ans;
    }
}