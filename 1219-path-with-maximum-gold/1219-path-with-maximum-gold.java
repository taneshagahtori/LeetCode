class Solution {
    private static final int[][] DIRECTIONS = {{-1,0}, {0,1}, {1,0}, {0,-1}};
    public int getMaximumGold(int[][] grid) {
        int[] maxGold = {0};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                findMax(grid, i, j, 0, maxGold);
            }
        }
        return maxGold[0];
    }

    private void findMax(int[][] grid, int i, int j, int collected, int[] maxGold) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[i].length || grid[i][j] == 0) {
            maxGold[0] = Math.max(maxGold[0], collected);
            return;
        }
        collected += grid[i][j];
        int originalValue = grid[i][j];
        grid[i][j] = 0;
        for (int[] direction : DIRECTIONS) {
            findMax(grid, i + direction[0], j + direction[1], collected, maxGold);
        }
        grid[i][j] = originalValue;
    }
}