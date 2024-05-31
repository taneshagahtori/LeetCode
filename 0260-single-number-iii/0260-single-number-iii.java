class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int setBit = xor & -xor; 
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & setBit) == 0) {
                num1 ^= num; 
            } else {
                num2 ^= num; 
            }
        }
        
        return new int[] {num1, num2};
    }
}