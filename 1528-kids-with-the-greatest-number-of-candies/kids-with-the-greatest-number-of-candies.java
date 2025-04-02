import java.util.Arrays;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // int max = Arrays.stream(candies).max();
        int max = Arrays.stream(candies).max().orElseThrow();
        ArrayList<Boolean> arr = new ArrayList<>();
        for(int i : candies){
            arr.add((i+extraCandies)>=max);
        }
        return arr;
    
    }
}