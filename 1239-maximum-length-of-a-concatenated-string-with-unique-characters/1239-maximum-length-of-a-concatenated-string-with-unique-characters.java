class Solution {
    public int maxLength(List<String> arr) {
        return recursion(arr,0,"");
    }

    private int recursion(List<String> arr, int index, String curr){
        if(!isUnique(curr)){
            return 0;
        }

        int maxLen = curr.length();

        for(int i=index; i<arr.size(); i++){
            maxLen = Math.max(maxLen, recursion(arr,i+1, curr+arr.get(i)));
        }
        return maxLen;
    }

    private boolean isUnique(String str){
        Set<Character> st = new HashSet<>();
        for(char c:str.toCharArray()){
            if(st.contains(c)){
                return false;
            }
            st.add(c);
        }
        return true;
    }


}