class Solution {
    public int totalNumbers(int[] digits) {
        int[]freq=new int[10];
        for(int i:digits){
            freq[i]++;
        }
        int count=0;
        for(int num=100;num<=999;num++){
             if(num%2!=0){
                continue;
             }
             int n=num;
             int[]need=new int[10];
             while(n>0){
                need[n%10]++;
                n=n/10;
             }
             boolean possible=true;
             for(int i=0;i<10;i++){
                if(need[i]>freq[i]){
                    possible=false;
                    break;
                }

             }
             if(possible){
                count++;

             }
        }
        return count;
        
    }
}