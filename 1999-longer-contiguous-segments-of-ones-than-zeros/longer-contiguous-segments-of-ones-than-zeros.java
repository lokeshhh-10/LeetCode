class Solution {
    public boolean checkZeroOnes(String s) {
        int one_count = 0;
        int zero_count = 0;
        int one_temp = 0;
        int zero_temp = 0;
        int l = 0;
        int r = 0;
        while(r <s.length()){
            if(s.charAt(l)=='1' && s.charAt(l) == s.charAt(r)){
                one_temp+=1;
                one_count = Math.max(one_count, one_temp);
                r+=1;
            }else if(s.charAt(l)=='0' && s.charAt(l) == s.charAt(r)){
                zero_temp+=1;
                zero_count = Math.max(zero_temp, zero_count);
                r+=1;
            }else{
                l = r;
                one_temp = 0;
                zero_temp = 0;
                // r+=1;
            }
        }
        System.out.println(zero_count);
        System.out.println(one_count);
        return (one_count > zero_count) ? true : false;



        
        
    }
}