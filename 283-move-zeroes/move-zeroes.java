class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int n = 0;
        while(n<nums.length){
            if(nums[n]!=0){
                nums[i] = nums[n];
                i++;
            }
            n++;
        }

        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
        
    }
}