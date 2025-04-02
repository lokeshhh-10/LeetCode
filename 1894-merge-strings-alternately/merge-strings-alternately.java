class Solution {
    public String mergeAlternately(String word1, String word2) {
        ArrayList<Character> new_arr = new ArrayList<>();
        int i = 0;
        while(i < word1.length() || i < word2.length()){
            if(i < word1.length()){
                new_arr.add(word1.charAt(i));
            }
            if(i < word2.length()){
                new_arr.add(word2.charAt(i));
            }
            i+=1;
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : new_arr){
            sb.append(c);
        }

        return sb.toString();
        
    }
}