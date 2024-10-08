class Solution {
    public int minSwaps(String s) {
        int open=0;
        int close=0;
        int count=0;
        
        for(int c: s.toCharArray()){
            if(c=='['){
                open++;
            }
            else{
                if(open>0){
                    open--;
                }
                else{
                    close++;
                }
            } 
        }
        count=(close+1)/2;
        return count;
    }
}