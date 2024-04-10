class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        int[] res = new int[deck.length];
        res[0] = deck[0];

        int k = 1, c = 0;
    
        while (k < deck.length) {
            for (int i = 1; i < deck.length; i++) {
                if (res[i] == 0) {
                    c++;
                    if (c == 2) {
                        res[i] = deck[k++];
                        c = 0;
                    }
                }
            }
        }
        return res;
    }
}