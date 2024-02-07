class Solution {
    public String frequencySort(String s) {
        StringBuilder res = new StringBuilder();
//        int[][] freq = new int[26][2];
        int[][] freq = new int[256][2];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch][0]++;
            freq[ch][1] = ch;
        }

        // -a[0] for descending order
        Arrays.sort(freq, Comparator.comparingInt(a -> -a[0]));

        for(int i = 0; i < 256; i++){
            if (freq[i][0] == 0) break;
            for (int j = 0; j < freq[i][0]; j++) {
                res.append((char)freq[i][1]);
            }
        }

        return res.toString();
    }
}