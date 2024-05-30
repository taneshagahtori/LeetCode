class Solution {
    public int countTriplets(int[] arr) {
        int total =0;
        int[] prefix = new int[arr.length+1];
        for(int i=1;i<prefix.length;i++)
            prefix[i] = prefix[i-1] ^ arr[i-1];
        for(int i=1;i<prefix.length;i++){
            for(int j=i+1;j<prefix.length;j++){
                for(int k=j;k<prefix.length;k++){
                    if((prefix[i-1]^prefix[j-1])==(prefix[j-1]^prefix[k]))
                         total++;
                }
            }
        }
        return total;
    }
}