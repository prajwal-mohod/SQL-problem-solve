class Solution {
    public int majorityElement(int[] nums) {
        
        int ans = nums[0], countAns = 0;
        for(int i=0; i<nums.length-1; i++){

            int count = 0;
            if(nums[i] == ans && i!=0){
                continue;
            }
            for(int j=i+1; j<nums.length; j++){

                if(nums[i] == nums[j]){
                    count++;
                }

                if(count > countAns){
                    countAns = count;
                    ans = nums[i];
                }
            }
        }
        return ans;
    }
}