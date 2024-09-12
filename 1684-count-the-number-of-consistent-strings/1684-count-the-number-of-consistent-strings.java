class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        int count=words.length;
        for(char c:allowed.toCharArray()){
            set.add(c);
        }

        for(int i=0;i<words.length;i++){
            String str=words[i];
            for(char temp:str.toCharArray()){
                if(!set.contains(temp)){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}