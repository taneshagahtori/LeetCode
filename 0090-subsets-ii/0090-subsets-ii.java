class Solution {
    private void backtrack(List<List<Integer>> FinalList, List <Integer> list, int[] nums, int idx){
        if (FinalList.contains(list)){
            return;
        }
        FinalList.add(new ArrayList<>(list));
        
        for(int i=idx; i<nums.length; i++){
            //pick
            list.add(nums[i]);
            //backtrack the new subset
            backtrack(FinalList, list,nums, i+1);
            //not pick
            list.remove(list.size()-1);
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> FinalList= new ArrayList<>();
        Arrays.sort(nums);
        backtrack(FinalList, new ArrayList<>(), nums, 0);
        return FinalList;
    }
}