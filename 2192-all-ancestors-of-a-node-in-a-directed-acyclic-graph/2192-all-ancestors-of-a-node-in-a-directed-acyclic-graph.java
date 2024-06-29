class Solution {
    public void helper(HashMap<Integer, HashSet<Integer>> copy, int no, HashSet<Integer> ancestor) {
        if (!copy.containsKey(no)) {
            return;
        }
        for (int i : copy.get(no)) {
            if (!ancestor.contains(i)) {
                ancestor.add(i);
                helper(copy, i, ancestor);
            }
        }
    }

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
        for (int[] edge : edges) {
            hm.putIfAbsent(edge[1], new HashSet<>());
            hm.get(edge[1]).add(edge[0]);
        }
        HashMap<Integer, HashSet<Integer>> copy = new HashMap<>(hm);
        for (int no : copy.keySet()) {
            HashSet<Integer> ancestors = new HashSet<>();
            helper(copy, no, ancestors);
            hm.put(no, ancestors);
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(i)) {
                list.add(new ArrayList<>());
            } else {
                List<Integer> newList = new ArrayList<>(hm.get(i));
                Collections.sort(newList);
                list.add(newList);
            }
        }

        return list;
    }
}