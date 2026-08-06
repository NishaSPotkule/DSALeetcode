class Solution {
    public int smallestNumber(int n, int t) {
    
        int ans=0;
        while(n<=n+t){
            int sum=1;
            int num=n;
            while(num>0){
                int d=num%10;
                sum*=d;
                num=num/10;
            }
            if(sum%t==0){
               ans=n;
               break;
            }
            n++;

        }
        return ans;


        
    }
}