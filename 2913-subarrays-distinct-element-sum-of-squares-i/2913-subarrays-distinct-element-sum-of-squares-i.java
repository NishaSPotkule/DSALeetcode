class Solution {
    int ans=0;
    public int sumCounts(List<Integer> nums) {
        for(int i=0;i<nums.size();i++){

           // HashMap<Integer,Integer>map=new HashMap<>();
           HashSet<Integer>set=new HashSet<>();
            int count=0;

            for(int j=i;j<nums.size();j++){
               // map.put(nums.get(j),map.getOrDefault(nums.get(j),0)+1);
               set.add(nums.get(j));
                ans+=set.size()*set.size();



            }
        }
        return ans;
        
    }
}