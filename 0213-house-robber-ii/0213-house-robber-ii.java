class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }    
        if(nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }    
        int n = nums.length;
        int[] dp1 = new int[n-1];
        int[] dp2 = new int[n-1];
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[1],dp1[0]);
        for(int i = 2;i<n-1;i++){
            dp1[i] = Math.max(nums[i] + dp1[i-2], dp1[i-1]);
        }
        dp2[0] = nums[1];
        dp2[1] = Math.max(nums[2],dp2[0]);
        for(int i = 2;i<n-1;i++){
            dp2[i] = Math.max(nums[i+1] + dp2[i-2], dp2[i-1]);
        }
        int f =  Math.max(dp1[n-2],dp1[n-3]);
        int s = Math.max(dp2[n-2], dp2[n-3]);
        return Math.max(s, f);
    }
}