class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+"," ");
        String[] words = s.split(" ");
        int l = 0;
        int r = words.length -1;
        while(l<r){
            String temp = words[l];
            words[l] = words[r];
            words[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(words));
        System.out.println(String.join(" ",words));
        return String.join(" ",words);
        
    }
}