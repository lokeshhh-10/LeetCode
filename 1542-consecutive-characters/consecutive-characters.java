class Solution {
    public int maxPower(String s) {
        int max=1;
         int count=1;
         for(int i=1;i<s.length();i++){
             count=(s.charAt(i)==(s.charAt(i-1)))?count+1:1;
             if(count>max){
                 max=count;
             }
         }
         return max;
     }
        
    }