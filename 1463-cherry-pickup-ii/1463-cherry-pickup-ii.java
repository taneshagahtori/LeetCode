class Solution {

    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int dp[][][] = new int[m][n][n];
        for(int[][] rowOne : dp){
            for(int[] rowTwo : rowOne){
                Arrays.fill(rowTwo, -1);
            }
        }
        
        return f(0, 0, n - 1, grid, dp);
    }
    
    int f(int row, int colA, int colB, int[][] arr, int[][][] dp){
        if(colA < 0 || colA >= arr[0].length || colB < 0 || colB >= arr[0].length) return (int)(Math.pow(-10, 9));
        if(row == arr.length - 1){
            if(colA == colB) return arr[row][colA];
            else return arr[row][colA] + arr[row][colB];
        }
        if(dp[row][colA][colB] != -1) return dp[row][colA][colB];
        
        int max = 0;
        for(int colChangeA = -1; colChangeA <= 1; colChangeA++){
            for(int colChangeB = -1; colChangeB <= 1; colChangeB++){
                if(colA == colB){
                    max = Math.max(max, arr[row][colA] + f(row + 1, colA + colChangeA, colB + colChangeB, arr, dp));
                }
                else{
                    max = Math.max(max, arr[row][colA] + arr[row][colB] + f(row + 1, colA + colChangeA, colB + colChangeB, arr, dp));
                }
            }
        }
        return dp[row][colA][colB] = max;
    }
}