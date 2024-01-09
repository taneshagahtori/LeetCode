class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String nums=Integer.toString(num);
        for(int i=0; i<nums.length()-k+1;i++){
            int sub=Integer.parseInt(nums.substring(i,i+k));
            if(sub!=-0 && num%sub==0){
                count++;
            }
        }
        return count;
    }
}