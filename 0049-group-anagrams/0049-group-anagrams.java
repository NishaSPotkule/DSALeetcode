class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<Integer>>list=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[]c=strs[i].toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
          
                map.get(s).add(strs[i]);
        }
        
        return new ArrayList(map.values());
        
    }
}