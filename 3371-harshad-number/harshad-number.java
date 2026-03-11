class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
        
        int temp = n, sum=0;
        
        while(n != 0){
            sum = sum + n%10;
            n = n/10;
        }
        n = temp;

        if(n%sum == 0)
            return sum;
        else 
            return -1;
    }
}