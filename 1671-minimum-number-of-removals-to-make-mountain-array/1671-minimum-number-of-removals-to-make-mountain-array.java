class Solution {
    public int LIS(int []nums){
        int n = nums.length;
        int [] dp1 = new int[n];
        int [] dp2 = new int[n];

        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
 
        for(int ind=0;ind<n;ind++){
            for(int prev=0;prev<ind;prev++){
                if (nums[prev]<nums[ind] && 1+dp1[prev]>dp1[ind]){
                    dp1[ind] = 1+dp1[prev];
                }
            }
        }

        for(int ind=n-1;ind>=0;ind--){
            for(int prev=n-1;prev>ind;prev--){
                if (nums[prev]<nums[ind] && 1+dp2[prev]>dp2[ind]){
                    dp2[ind] = 1+dp2[prev];
                }
            }
        }

        int maxMountainLen = 0;
        for(int i=1;i<n-1;i++){
            if (dp1[i] > 1 && dp2[i] > 1) { 
                maxMountainLen = Math.max(maxMountainLen, dp1[i] + dp2[i] - 1);
            }
        }
        return maxMountainLen;
    }
    public int minimumMountainRemovals(int[] nums) {
        return nums.length - LIS(nums);
    }
}
