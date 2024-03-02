class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=result.length-1;i>=0;i--){
            int leftsq=nums[left]*nums[left];
            int rightsq=nums[right]*nums[right];
            if(leftsq>rightsq){
                result[i]=leftsq;
                left++;
            }
            else{
                result[i]=rightsq;
                right--;
            }
        }
        return result;
    }
}