class Solution {
    public int lengthOfLastWord(String s) {
        String[] myStr =s.split(" ");
        String word = myStr[(myStr.length -1)];
        return word.length(); 
    }
}