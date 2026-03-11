class Solution {
    public int addDigits(int n) {

        if(n <= 9){
            return n;
        }

        while(n > 9){
            int sum = 0;
            while(n != 0){

                int last = n%10;
                sum = sum + last;
                n = n/10;
            }
            n = sum;
        }
        return n;
    }
}