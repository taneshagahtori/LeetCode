class Solution {
        
    public long countSubarrays(int[] nums, int minK, int maxK) {
		 long res = 0L;
        int left=0, minIdx=-1, maxIdx=-1, n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] < minK || nums[i] > maxK){ 
                left = i + 1;
                minIdx = maxIdx = -1;
                continue;
            }
            if(nums[i] == minK) minIdx = i;
            if(nums[i] == maxK) maxIdx = i;
            
            if(minIdx != -1 && maxIdx != -1){
                long val = Math.min(minIdx, maxIdx) - left + 1;
                res += val;
            }
        }
        return res;
    }
}