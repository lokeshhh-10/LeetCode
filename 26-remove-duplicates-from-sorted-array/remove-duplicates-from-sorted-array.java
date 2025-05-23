class Solution {
    public int removeDuplicates(int[] nums) {

        int l = 0;
        int r = 1;

        while(r < nums.length){
            if(nums[l] != nums[r]){
                l+=1;
                nums[l] = nums[r];
            }
            r+=1;
        }

        return l+1;
    }
}