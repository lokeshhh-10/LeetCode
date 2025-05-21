class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> seen = new HashSet<>();
        for(Integer num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Integer num : map.values()){
            if(!seen.add(num)){
                return false;
            }
        }

        return true;


        
    }
}