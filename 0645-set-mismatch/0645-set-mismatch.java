class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] vis = new int[nums.length];
        int[] abs = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            vis[nums[i] - 1]++;
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(vis[i] == 2) arr[0] = i + 1;
            if(vis[i] == 0) arr[1] = i + 1;
        }
        return arr;
    }
}