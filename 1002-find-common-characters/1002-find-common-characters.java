class Solution {
    public List<String> commonChars(String[] words) {
        int[] result= new int[26];
        Arrays.fill(result,Integer.MAX_VALUE);
        for (String word:words){
            int[] temp= new int[26];
            for(char ch: word.toCharArray()){
                temp[ch-'a']++;
            }
            for(  int i=0; i<26; i++){
                result[i]=Math.min(result[i], temp[i]);
            }
        }
        List <String> ans= new ArrayList();
        for(int i=0; i<26; i++){
            for (int j=0; j<result[i]; j++){
                ans.add(String.valueOf((char)(i+'a')));
            }
        }
        return  ans;
    }
}