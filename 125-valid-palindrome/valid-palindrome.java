class Solution {
    public boolean isPalindrome(String s) {
        String res = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // space is included here
        System.out.println(res);
        String reversed = new StringBuilder(res).reverse().toString();
        return res.equals(reversed);
        
    }
}