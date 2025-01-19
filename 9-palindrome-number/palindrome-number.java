class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        if(num.charAt(0) == '-')
            return false;
        int l =0;
        int r = num.length() -1;
        while(l<r){
            if(num.charAt(l) != num.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}