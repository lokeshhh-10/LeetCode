class Solution {
    public String truncateSentence(String s, int k) {
        String[] new_str = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i=0; i<k; i++){
            str.append(new_str[i]+" ");
        }
        return str.toString().trim();
        
    }
}