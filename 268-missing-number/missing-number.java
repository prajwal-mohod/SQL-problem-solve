class Solution {
    public int missingNumber(int[] nums) {
        
        int max = nums[0];
        for(int i=0; i<nums.length; i++){

            boolean isMissing  = true;
            for(int j : nums){

                if(j > max){
                    max = j;
                }
                if(j == i){
                    isMissing = false;
                    continue;
                }
            }
            if(isMissing){
                return i;
            }
        }
        return max+1;
    }
}