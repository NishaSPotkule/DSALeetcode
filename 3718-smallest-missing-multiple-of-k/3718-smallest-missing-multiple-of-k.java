class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();

        for(int i:nums){
            set.add(i);
        }
        int n=k;
       for(int i=0;i<nums.length;i++){
         if(!set.contains(n)){
            return n;

         }
         n=n+k;

        }
        return n;




    }
}