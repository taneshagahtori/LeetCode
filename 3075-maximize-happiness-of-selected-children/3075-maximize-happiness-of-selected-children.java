class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
        Arrays.sort(happiness);
        long ans=0;
        int count=0;
        for(int i=n-1;i>=0 && k>0;i--){
           ans=ans+Math.max(happiness[i]-count,0);
           count++;
           k--;
        }
        return ans;
    }
}