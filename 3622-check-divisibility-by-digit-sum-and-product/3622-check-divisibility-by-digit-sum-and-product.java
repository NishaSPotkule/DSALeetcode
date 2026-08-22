class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int num=n;
        int product=1;
        while(n!=0){
            int d=n%10;
            sum+=d;
            product*=d;
            n=n/10;
        }
        sum+=product;
        if(num%sum==0){
            return true;
        }
        return false;
        
    }
}