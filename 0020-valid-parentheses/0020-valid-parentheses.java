class Solution {
    public boolean isValid(String s) {
        
        int size = s.length();
        if(size % 2 != 0){
            return false;
        }
        char[] str = s.toCharArray();
        Stack<Character> st = new Stack<>();
        
        //2. For close brackets last else-if will execute
        for(char c : str)
        {
            if(c == '('){
                 st.push(')');
            }
            else if(c == '{') {
                st.push('}');
            }
            else if(c == '['){
                st.push(']');
            } 
            else if(st.isEmpty() || st.pop() != c) {
                return false;

            }
        }  
    return st.isEmpty();
    }
}