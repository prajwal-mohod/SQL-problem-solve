class Solution {
    public int majorityElement(int[] nums) {
        
        int ans = nums[0];
        int countAns = 0;
        for(int i=0; i<nums.length; i++){

            int count = 1;
            for(int j=i+1; j<nums.length; j++){

                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > countAns){
                countAns = count;
                ans = nums[i];
            }
            
        }
        return ans;
    }
}