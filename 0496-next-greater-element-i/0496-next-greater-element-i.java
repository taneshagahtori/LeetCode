class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map=new HashMap<>();
        Stack <Integer> stack= new Stack<>();
        for(int val: nums2){
            while(!stack.isEmpty() && stack.peek() <val){
                map.put(stack.pop(), val);
            }
            stack.push(val);
        }
        int[] ans= new int[nums1.length];
        for (int i=0; i<nums1.length; i++){
            ans[i]=map.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}