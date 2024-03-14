class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        int totalCount = 0;
        int currSum = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int e : nums) {
            currSum += e;
            if(currSum == goal) {
                totalCount++;
            }

            if(map.containsKey(currSum - goal)) {
                totalCount += map.get(currSum - goal);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return totalCount;
    }
}