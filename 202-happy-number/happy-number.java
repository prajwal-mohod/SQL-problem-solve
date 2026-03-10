class Solution {
    public boolean isHappy(int n) {

        int temp = n;

 		while(n != 1 && n != 4){
 			System.out.println("Loop for : "+n);

 			int ans = 0;

 			if(n < 9)
 				n = n*n;

 			while(n != 0){

 				int last = n%10;
 				ans = ans + last*last;
 				n /= 10;
 			}
 			n = ans;
	 	}

	 	if(n==1)
	 		return true;
	 	else 
	 		return false ;
    }
}