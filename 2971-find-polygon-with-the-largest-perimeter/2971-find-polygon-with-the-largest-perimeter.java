class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            int val=nums[i];
            sum-=val;
            if(sum>val){
                return sum+val;
            }
        }
        return -1;
    }
}