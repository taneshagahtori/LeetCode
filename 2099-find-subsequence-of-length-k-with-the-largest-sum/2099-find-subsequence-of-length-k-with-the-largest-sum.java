class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int arr[] = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=(arr.length-k); i--){
            list.add(arr[i]);
        }
        int res[] = new int[k];
        int ind = -1;
        int index;
        for(int i=0; i<nums.length; i++){
            index = list.indexOf(nums[i]);
            if(index != -1){
                list.remove(index);
                ind += 1;
                if(ind >= k)
                    break;
                res[ind] = nums[i];
            }
        }
        return res;
    }
}