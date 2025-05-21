class Solution {
    public int maxPower(String s) {
        int l = 0;
        int r = 0;
        int max = 0;
        int sum = 0;

        while(r<s.length()){
            if(s.charAt(l) == s.charAt(r)){
                sum+=1;
                max = Math.max(sum,max);
                r+=1;
            }else{
                sum = 1;
                l = r;
                r+=1;
            }
        }

        return max;
        

        
    }
}