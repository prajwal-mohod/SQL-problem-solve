class Solution {
    public int singleNumber(int[] arr) {
        
        for(int i=0; i<arr.length-1; i++){

            boolean isUnique = true;
            for(int j = 0; j<arr.length; j++){

                if(arr[i] == arr[j] && i!=j){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
}