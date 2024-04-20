class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> res = new ArrayList<>();
        int n = land.length;
        int m = land[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(land[i][j] == 1){
                    int[] curr = new int[]{i, j, 0, 0};
                    check(i, j, land, curr);
                    res.add(curr);
                }
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public void check(int i, int j, int[][] land, int[] curr){
        int r = i, c = j;
        while(c < land[0].length && land[r][c] == 1){
            c++;
        }
        while(r < land.length && land[r][c - 1] == 1){
            r++;
        }
        curr[2] = r - 1;
        curr[3] = c - 1;
        for(int m = i; m < r; m++){
            for(int n = j; n < c; n++){
                land[m][n] = 0;
            }
        }
    }
}