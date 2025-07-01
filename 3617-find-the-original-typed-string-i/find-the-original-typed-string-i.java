class Solution {
    public int possibleStringCount(String word) {
        int l =0;
        int r = 1;
        int count = 1;

        while( r < word.length()){
            if(word.charAt(l) == word.charAt(r)){
                count+=1;
            }
            l+=1;
            r+=1;
        }
        return count;
        
    }
}