class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0 ){
            return true;
        }
        if(t.length()==0){
            return false;
        }
        int count = 0;
        int i = 0;
        while(i<t.length()){
            if(t.charAt(i) == s.charAt(count)){
                count+=1;
            }
            i++;
        if(count == s.length()){
            return true;
        }
        }
        return false;
        
    }
}