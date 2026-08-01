class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1){
            return true;
        }
       if(Character.isLowerCase(word.charAt(0)) ){
          return isLowerCase(word.substring(1,word.length()));
       }
       else if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
             return isCapital(word.substring(1,word.length()));
       }
       else if(Character.isUpperCase(word.charAt(0))){
         return isLowerCase(word.substring(1,word.length()));

       }
       return false;
        
    }
    boolean isCapital(String word){
        
        for(int i=0;i<word.length();i++){
            if(!Character.isUpperCase(word.charAt(i))){
                return false;
            }
           
        }
         return true;

    }
    boolean isLowerCase(String word){
         for(int i=0;i<word.length();i++){
            if(!Character.isLowerCase(word.charAt(i))){
                return false;
            }
           
        }
         return true;

    }
}