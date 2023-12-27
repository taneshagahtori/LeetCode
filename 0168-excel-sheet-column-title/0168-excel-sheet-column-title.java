class Solution {
    public String convertToTitle(int cN) {
        StringBuilder res = new StringBuilder();
        while (cN> 0) {
            cN--;  
            char digit=(char)('A'+cN%26);
            res.insert(0,digit);
            cN/=26;
        }
        return res.toString();
    }
}