class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU"; 
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;

        while (l < r) {
            while (l < r && vowels.indexOf(arr[l]) == -1) l++; // Move left pointer
            while (l < r && vowels.indexOf(arr[r]) == -1) r--; // Move right pointer

            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

        return new String(arr);
    }
}
