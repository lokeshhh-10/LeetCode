class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        String word = words[words.length -1];
        return word.length();
        
    }
}