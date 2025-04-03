class Solution {
    public String reverseWords(String s) {
        // s = s.trim().replaceAll("\\s+"," ");
        String[] words = s.trim().split("\\s+");
        int l = 0;
        int r = words.length -1;
        while(l<r){
            String temp = words[l];
            words[l] = words[r];
            words[r] = temp;
            l++;
            r--;
        }
        return String.join(" ",words);
        
    }
}