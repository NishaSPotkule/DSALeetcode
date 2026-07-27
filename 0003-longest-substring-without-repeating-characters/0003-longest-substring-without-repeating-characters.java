class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer>map=new HashMap<>();
        int right=0;
        int left=0;
        int max=0;
        while(right<s.length()){
            if(!map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),1);
             
                max=Math.max(max,right-left+1);
                   right++;
            }
            else{
                map.remove(s.charAt(left));
                    left++;

                }
                
            }
            

        
        return max;
        
    }
}