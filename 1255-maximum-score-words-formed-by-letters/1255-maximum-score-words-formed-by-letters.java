class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] letterHash = new int[26];
        int[] hash = new int[26];

        for (int i = 0; i < letters.length; i++) {
            letterHash[letters[i] - 'a']++;
        }

        int ans = 0;
        ans = backtracking(words, score, letterHash, hash, 0, 0, ans);
        return ans;
    }

    public  int backtracking(String[] words, int[] scores, int[] letterHash, int[] hash, int position, int temp,
            int ans) {
        for (int i = 0; i < 26; i++) {
            if (hash[i] > letterHash[i]) {
                return ans;
            }
        }

        ans = Math.max(ans, temp);

        for (int i = position; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                hash[c - 'a']++;
                temp += scores[c - 'a'];
            }

            ans = backtracking(words, scores, letterHash, hash, i + 1, temp, ans);

            for (char c : words[i].toCharArray()) {
                hash[c - 'a']--;
                temp -= scores[c - 'a'];
            }
        }

        return ans;
    }
}