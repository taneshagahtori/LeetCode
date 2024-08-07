class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map= new HashMap<>();
        for(int i=0; i<names.length; i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] ans= new String[names.length];
        int idx=0;
        for(int i=heights.length-1; i>=0; i--){
            ans[idx]=map.get(heights[i]);
            idx++;
        }
        return ans;
    }
}