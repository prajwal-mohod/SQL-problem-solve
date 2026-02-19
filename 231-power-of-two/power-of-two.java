class Solution {
    public boolean isPowerOfTwo(int n) {
        int pow = 1;

        for(int i=0; i<=Math.sqrt(n); i++){
            
            if(pow == n)
                return true;

             pow = 2 * pow;

        }
        if(pow == n)
            return true;
        else
            return false;
    }
}