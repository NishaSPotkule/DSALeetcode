class Solution {

    public boolean checkIfPangram(String sentence) {
        int[]arr=new int[26];
        for(int i=0;i<sentence.length();i++){
            int idx=sentence.charAt(i)-'a';
            arr[idx]++;


        }    
        for(int i=0;i<26;i++){
            if(arr[i]<1){
                return false;
            }
        }
        return true;
    }
}