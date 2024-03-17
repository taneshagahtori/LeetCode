class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        list.add(newInterval);
        
        int idx = 0;
        for (int[] itv : intervals) {
            int[] ref = list.get(idx);
            int start = ref[0];
            int end = ref[1];
            
            if ((itv[0] >= start && itv[0] <= end) || (itv[1] >= start && itv[1] <= end)) {
                ref[0] = Math.min(itv[0], start);
                ref[1] = Math.max(itv[1], end);
            } else if (itv[0] < start && itv[1] > end) {
                ref[0] = itv[0];
                ref[1] = itv[1];
            } else if (itv[1] < start) {
                list.add(idx, itv);
                idx++;
            } else {
                list.add(itv);
            }
        }
        
        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            int[] arr = list.get(i);
            ans[i][0] = arr[0];
            ans[i][1] = arr[1];
        }
        return ans;
    }
}