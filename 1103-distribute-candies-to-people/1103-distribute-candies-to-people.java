class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int index=0;
        int candie=1;
        int[] ans= new int[num_people];
        while(candies>0){
            ans[index++ % num_people] += Math.min(candie, candies);
            candies -=candie;
            candie++;
        }
        return ans;
    }
}