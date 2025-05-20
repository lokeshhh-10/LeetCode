class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = 1;
        // ArrayList<int> arr = ArrayList<>();
        // int[] num = new int[2];
        while(l < nums.length){
            while(r < nums.length){
                if(nums[l]+nums[r] == target){
                    // num[0] = l;
                    // num[1] = r;
                    return new int[]{l,r};


                }
                r+=1;
            }
            l+=1;
            r = l+1;
        }
        // return num;
        return new int[]{l,r};
    }
}