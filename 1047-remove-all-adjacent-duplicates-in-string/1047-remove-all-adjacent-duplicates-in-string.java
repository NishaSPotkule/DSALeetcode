class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));

            }
            else if(st.peek()!=s.charAt(i)){
                st.push(s.charAt(i));
            }
            else{
                st.pop();
            }
        }
        String str="";
        while(!st.isEmpty()){
            str+=st.pop();
        }
        String strr="";
        for(int i=str.length()-1;i>=0;i--){
            strr+=str.charAt(i);
        }
        return strr;
        
    }
}