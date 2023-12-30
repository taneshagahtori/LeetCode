class Solution {
    public boolean makeEqual(String[] words) {
        int count[]= new int[26];
        for(String w:words){
            for(char ch:w.toCharArray()){
                count[ch-'a']++;
            }
        }
        for (int i=0; i<26; i++){
            if(count[i]% words.length!=0){
                return false;
            }
        }
        return true;
    }
}