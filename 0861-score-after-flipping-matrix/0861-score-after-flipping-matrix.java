class Solution {

    public int matrixScore(int[][] grid) {
        for (int[] row : grid) {
            if (row[0] == 0) {
                flip(row);
            }
        }
        int result = 0;
        int pow = 1;
        int m = grid.length;
        int n = grid[0].length;
        for (int j=n - 1; j>=0; j--) {
            int bitCount = 0;
            for (int i=0; i<m; i++) {
                bitCount += grid[i][j];
            }
            bitCount = Math.max(bitCount, m - bitCount);
            result += bitCount * pow;
            pow = pow << 1;
        }
        return result;
    }

    private void flip(int[] row) {
        for (int j=0; j<row.length; j++) {
            row[j] = 1- row[j];
        }
    } 
}