class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // Splitting both sentences into words
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        
        // Using a HashMap to count word occurrences
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Counting words from the first sentence
        for (String word : words1) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Counting words from the second sentence
        for (String word : words2) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Collecting uncommon words
        List<String> result = new ArrayList<>();
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) == 1) {
                result.add(word);
            }
        }
    
        return result.toArray(new String[0]);
    }
}
