class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map= new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        List<Integer> list= new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b)->{
            if(map.get(a)==map.get(b)){
                return b-a;
            }
            else{
               return map.get(a)-map.get(b); 
            }
        });
        int[] ans=new int[nums.length];
        int idx=0;
        for(int num:list){
            for(int i=0; i<map.get(num); i++){
                ans[idx++]=num;
            }
        }
        return ans;
    }
}

