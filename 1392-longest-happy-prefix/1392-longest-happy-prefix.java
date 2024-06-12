
class Solution{
    public String longestPrefix(String str) {
        String ans="";
        for(int i=str.length()-1; i>=0; i--){
            String s=str.substring(0,i);
            if(str.endsWith(s)){
                ans=s;
                break;
            }
        }
        return ans;
    }
}