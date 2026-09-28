class Solution {
    public int maxDepth(String s) {
        Stack<Character>st=new Stack<>();
        int depth=0;;
        int max=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
                
            }
            if(s.charAt(i)==')'){
                ans=depth;
               max=Math.max(max,ans);
               depth--;
            }
        }
        return max;
        

        
    }
}