class Solution {
    public int minIncrementForUnique(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            int prev=nums[i-1];
            int curr=nums[i];
            if(prev>=curr){
                ans+=prev-curr+1;
                nums[i]=prev+1;
            }
        }
        return ans;
    }
}