class Solution {
    public int findNumbers(int[] nums) {
        
        int countOfEvenDgt=0;
        for(int i : nums){

            int countOfDgt=0; 
            while(i != 0){
                countOfDgt++;
                i = i/10;
            }
            if(countOfDgt %2 == 0){
                countOfEvenDgt++;
            }
        }
        return countOfEvenDgt;
    }
}