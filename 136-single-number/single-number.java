class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1){
            return nums[0];
        }
        int temp = 1;
        while(temp < nums.length){
            if(nums[temp] != nums[temp-1]){
                return nums[temp-1];
            }
            temp+=2;
        }
        return nums[temp-1];
        
    }
}