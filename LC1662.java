// Solution for 1662.

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word10 = null;
        String word20 = null;
        for (String words1 : word1) {
            word10 += words1;
        }
        for (String words2 : word2) {
            word20 += words2;
        }
        return (word10.equals(word20));
    }
}