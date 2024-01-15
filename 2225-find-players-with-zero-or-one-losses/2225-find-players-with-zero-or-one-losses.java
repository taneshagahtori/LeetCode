class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] map = new int[100001];
        
        Arrays.fill(map, -1);

        for(int i = 0; i < 2; i++) {
            ans.add(new ArrayList<>());
        }   
        for(var arr : matches){
            if(map[arr[0]] == -1) map[arr[0]] = 0;

            if(map[arr[1]] == -1) map[arr[1]] = 1;
            else map[arr[1]]++;
        }

        for(int i = 0; i < map.length; i++){
            if(map[i] > -1 && map[i] <= 1) ans.get(map[i]).add(i);
        }

        return ans;
    }
}