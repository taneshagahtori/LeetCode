class Solution {
    public void setZeroes(int[][] arr) {
        int m[][]=new int [arr.length][arr[0].length];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==0)
            {
                for(int k=0;k<arr[0].length;k++)
                m[i][k]=1;
                for(int k=0;k<arr.length;k++)
                m[k][j]=1;
            }
        }
    }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
              if(m[i][j]==1)
              arr[i][j]=0;
            }
        }
    }
}