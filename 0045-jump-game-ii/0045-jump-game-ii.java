class Solution {
    public int jump(int[] nums) {
        int l=0, r=0;
        int jump=0;
        if(nums.length==1){
            return 0;
        }
        for(int i=0; i<nums.length-1; i++){
            r=Math.max(r, nums[i]+i);
            if(l==i){
                l=r;
                jump++;
            }
        }
        return jump;
    }
}



