class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inout = new int[n+1];
        for(int[] i:trust){
            inout[i[0]]-=1;
            inout[i[1]]+=1;
        }
        for(int i=1;i<=n;i++){
            if(inout[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}