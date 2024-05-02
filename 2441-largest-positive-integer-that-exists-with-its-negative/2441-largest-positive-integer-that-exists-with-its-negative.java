class Solution {
    public int findMaxK(int[] nums) {
        int n=nums.length;
        int neg[]=new int[n];
        int pos[]=new int[n];
        int max=-1;
        int k=0,p=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                neg[k]=Math.abs(nums[i]);
                k++;
            }
            
            else if(nums[i]>0){
                pos[p]=nums[i];
                p++;
            }
            
        }
        
        Arrays.sort(neg,0,k);
        Arrays.sort(pos,0,p);
        int j=0,i=0;
        while(j<k && i<p){
            if(neg[j]<pos[i])
            j++;
            else if(neg[j]==pos[i]){
                max=Math.max(max,pos[i]);
                i++;
                j++;
            }
            
            else
            i++;
        }
        return max;
    }
}