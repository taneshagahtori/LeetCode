class Solution {
    public int minKBitFlips(int[] n, int k) {
        int a=0, c=1;
        int[] x = new int[n.length+1];
        for(int i=0; i+k<=n.length; i++){
            c ^= x[i];
            if(n[i]!=c){
                a++; c^=1; x[i+k]^=1;
            }
        }
        for(int i=n.length-k+1; i<n.length; i++){
            c^=x[i];
            if(n[i]!=c)return -1;
        }
        return a;
    }
}