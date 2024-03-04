class Solution {
    public int bagOfTokensScore(int[] arr, int p) {
        int n = arr.length;
        Arrays.sort(arr);
        int i=0,j=n-1;
        int ans = 0;
        int s = 0;
        while(i<=j){
            if(p>=arr[i]){
                p -= arr[i++];
                s++;
                ans = Math.max(ans,s);
            }else if(s>0){
                p+=arr[j--];
                s--;
            }else{
                break;
            }
        }
        return ans;
    }
}