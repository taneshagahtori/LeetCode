class Solution {
    public boolean halvesAreAlike(String s) {
        char[] arr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> vowels = new ArrayList<>();
        for(char c : arr){
            vowels.add(c);
        }
        int f_cnt = 0;
        int b_cnt = 0;
        for(int i=0; i<s.length()/2; i++){
            if(vowels.contains(s.charAt(i)))  f_cnt++;
        }
        for(int i=s.length()-1; i>=s.length()/2; i--){
            if(vowels.contains(s.charAt(i)))   b_cnt++;
        }
        return f_cnt==b_cnt;
    }
}