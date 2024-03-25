class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> s = new HashSet<>();

        for(int n : nums){
            if(s.contains(n)){
                res.add(n);
            } else {
                s.add(n);
            }
        }
        return res;
    }
}