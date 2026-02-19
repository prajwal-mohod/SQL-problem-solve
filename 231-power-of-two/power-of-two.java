class Solution {
    public boolean isPowerOfTwo(int n) {
        int pow = 1;
        if(n==pow)
            return true;
        for(int i=0; i<=Math.sqrt(n); i++){
            
            pow = 2 * pow;
            if(pow == n)
                return true;

        }
        return false;
    }
}