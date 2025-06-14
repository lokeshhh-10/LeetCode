class Solution {
    public int minMaxDifference(int num) {
        String s = Integer.toString(num);
        char firstNon9 = 0;
        char firstNon0 = 0;

        for (char c : s.toCharArray()) {
            if (firstNon9 == 0 && c >= '0' && c <= '8') firstNon9 = c;
            if (firstNon0 == 0 && c >= '1' && c <= '9') firstNon0 = c;
        }

        String maxStr = (firstNon9 != 0) ? s.replace(firstNon9, '9') : s;
        String minStr = (firstNon0 != 0) ? s.replace(firstNon0, '0') : s;

        return Integer.parseInt(maxStr) - Integer.parseInt(minStr);
    }
}