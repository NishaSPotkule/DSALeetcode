class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sumOfDigit(nums[i])==i){
                return i;
            }
        }
        return -1;
        
    }
    int sumOfDigit(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            n/=10;

        }
        return sum;
    }
}