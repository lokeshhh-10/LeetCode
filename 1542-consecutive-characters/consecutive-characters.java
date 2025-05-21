class Solution {
    public int maxPower(String s) {
        int l = 0;
        int r = 0;
        int max = 0;
        int sum = 0;

        while (r < s.length()) {
            if (s.charAt(l) == s.charAt(r)) {
                sum += 1;
                max = Math.max(max, sum);
                r += 1;
            } else {
                sum = 1;  // Start new count
                l = r;    // Move left pointer to new group
                r += 1;   // Move right pointer
            }
        }

        return max;
    }
}
