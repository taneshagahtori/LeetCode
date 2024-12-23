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
    public int minimumOperations(TreeNode root) {
        int res=0;
       Queue<TreeNode> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
           int len=q.size();
           List<Integer> s=new ArrayList<>();

           for(int i=0;i<len;i++){
               TreeNode first=q.poll();
               s.add(first.val);
               if(first.left!=null){
                   q.add(first.left);
               }
                  if(first.right!=null){
                   q.add(first.right);
               }
           }
           res+=minswap(s);
           
       }
       return res; 
    }
    public int minswap(List<Integer> nm){
      
    
    Map<Integer,Integer> kk=new HashMap<>();
        for(int i=0;i<nm.size();i++)
        {
            kk.put(nm.get(i),i);
        }
        Collections.sort(nm);
        boolean k[]=new boolean[nm.size()];
        int s=0;
        for(int i=0;i<nm.size();i++)
        {
            if(k[i] || kk.get(nm.get(i))==i)
            {
                continue;
            }
            int j=i,m=0;
            while(!k[j])
            {
                k[j]=true;
                j=kk.get(nm.get(j));
                m++;
            }
            if(m>0)
            {
                s+=m-1;
            }
        }
        return s;
    }
    
}