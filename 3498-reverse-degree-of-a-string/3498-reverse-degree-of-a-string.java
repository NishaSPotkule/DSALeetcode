class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index='z'-ch+1;
           
            int product=index*(i+1);
            sum+=product;

        }
        return sum;
        
    }
}