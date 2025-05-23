class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);

        for(int l =0; l < nums.length; l++){
            if(l> 0 && nums[l] == nums[l-1]){
                continue;
            }
            int m = l+1;
            int r = nums.length -1;

            while(m < r){
                int total = nums[l] + nums[m] + nums[r];
                if(total > 0){
                    r--;
                }else if(total < 0){
                    m++;
                }else{
                    arr.add(Arrays.asList(nums[l], nums[m],nums[r]));
                    m++;

                    while(nums[m] == nums[m-1] && m < r){
                        m++;
                    }
                }
            }
        }


        return arr;
        
        
    }
}