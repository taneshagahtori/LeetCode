class Solution {

    static int r;
    static int c;
    static int mod = 1000000007;

    static int dp[][][];

    static int dir[][] = {{-1,0},{1,0},{0,1},{0,-1}};

    static int helper(int i, int j, int max){
        if((i<0 || j<0 || i>=r || j>=c) && max>=0) return 1;
        if(max<=0) return 0;

        if(dp[i][j][max]!=-1) return dp[i][j][max];

        int ans = 0;

        for(int k=0; k<4; k++){
            int nr = i+dir[k][0];
            int nc = j+dir[k][1];
            ans = (ans%mod+(helper(nr,nc,max-1)%mod))%mod;
        }
        return dp[i][j][max] = ans%mod;
    }
    
    public int findPaths(int m, int n, int max, int str, int stc) {
        r = m;
        c = n;
        dp = new int[55][55][55];
        for(var a : dp) for(var b : a) Arrays.fill(b,-1);
        return helper(str,stc,max);
    }
}