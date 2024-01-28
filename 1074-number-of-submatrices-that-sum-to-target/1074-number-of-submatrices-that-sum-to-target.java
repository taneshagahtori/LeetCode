class Solution {
    public int numSubmatrixSumTarget(int[][] mat, int target) {
        int m = mat.length;
        int n = mat[0].length;
        for(int i=0; i<m; i++){
            for(int j=1; j<n; j++){
                mat[i][j] += mat[i][j-1];
            }
        }


        int res=0;
        for(int s=0; s<n; s++){
            for(int e=s; e<n; e++){
                int matrix_Sum = 0;

                Map<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                for(int k=0; k<m; k++){
                    int pref = s==0?0:mat[k][s-1];
                    matrix_Sum += mat[k][e]-pref;

                    if(map.containsKey(matrix_Sum-target)){
                        res += map.get(matrix_Sum-target);
                    }
                    map.put(matrix_Sum, map.getOrDefault(matrix_Sum, 0)+1);
                }
            }
        }

        return res;
    }
}