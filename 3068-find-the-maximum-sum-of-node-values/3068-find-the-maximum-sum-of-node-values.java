class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int n=nums.length;
        int c=0;
        // make it large
        int min = Integer.MAX_VALUE;
        int max= Integer.MAX_VALUE ;
        long sum=0;
        
        for (int i=0;i<n;i++)
        {
            int xor =  nums[i]^k;
            if (nums[i] < xor)
            {
                c++; 
                min= Math.min(min,xor-nums[i]);
                sum+= (long) xor;
            }
            else 
            {   
                max=Math.min(max,nums[i]-xor);
                sum+=(long) nums[i];
            }

         
        }
        if (c%2==1) {
            sum= Math.max(sum-(long)min,sum-(long)max);
        }
        
        return sum;
    }
}