class Solution {
    public void moveZeroes(int[] nums) {
        
        int nonZero = 0, zero = 0;

        while(nonZero < nums.length){

            if(nums[nonZero] != 0){

                swap(nums, nonZero, zero);
                nonZero++;
                zero++;
            }
            else {
                nonZero++;
            }
        }
    }

    public void swap(int arr[], int start, int end){

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}