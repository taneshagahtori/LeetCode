class Solution {
    public int minOperations(int[] nums) {
        int start=0;
        int ans=0;
        Arrays.sort(nums);
        while(start<nums.length){
            int end=start;
            while(end<nums.length && nums[start]==nums[end]){
                end++;
            }
            int count=end-start;
            if(count==1){
                return -1;
            }
            if(count%3 == 0){
                ans+=(count/3);
            }
            else{
                ans+=((count/3)+1);
            }
            start=end;
        }
        return ans;
    }
}

