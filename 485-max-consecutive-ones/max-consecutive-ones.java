class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int num = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == 1){
                num+=1;
                max = Math.max(num,max);
            }else{
                num = 0;
            }


        }
            return max;
    }
}