class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        boolean nums1_isodd=(nums1.length%2==0)?false:true;
        boolean nums2_isodd=(nums2.length%2==0)?false:true;
        int ans=0;
        if(nums1_isodd&&nums2_isodd){
            for(int i:nums1){
                ans=ans^i;
            }
            for(int i:nums2){
                ans=ans^i;
            }
            return ans;
        }
        else if(!nums1_isodd&&nums2_isodd){
               for(int i:nums1){
                ans=ans^i;
            }
             return ans;
        }
        else if(nums1_isodd&&!nums2_isodd){
            for(int i:nums2){
                ans=ans^i;
            }
            return ans;
        }
        else{
            return 0;
        }
    }
}