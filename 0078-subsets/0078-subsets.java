// class Solution {
//     public static void subsets(int[] arr, int idx, List<List<Integer>>list,List<Integer> ls){
//         if(idx>=arr.length){
//             list.add(new ArrayList<>(ls));
//             return;
//         }
//             subsets(arr,idx+1,list,ls);
//             ls.add(arr[idx]);
//             subsets(arr,idx+1,list,ls);
//             ls.remove(ls.size()-1);
//     }
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> list=new ArrayList<>();
//         List<Integer> ls=new ArrayList<>();
//         subsets(nums,0,list,ls);
//         return list;
//     }
// }


class Solution {
    private void backtrack(List<List<Integer>> FinalList, List <Integer> list, int[] nums, int idx){
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
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> FinalList= new ArrayList<>();
        Arrays.sort(nums);
        backtrack(FinalList, new ArrayList<>(), nums, 0);
        return FinalList;
    }
}