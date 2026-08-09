class WordDictionary {
    static class Node{
        Node[]children=new Node[26];
        boolean isEnd=false;
    }
    private Node root;
    public WordDictionary() {
        root=new Node();
        
    }
    
    public void addWord(String word) {
        Node current=root;
        for(char ch:word.toCharArray()){
            int idx=ch-'a';

            if(current.children[idx]==null){
                current.children[idx]=new Node();
            }
            current=current.children[idx];

        }
        current.isEnd=true;
        
    }
    
    public boolean search(String word) {
        return dfs(word,root,0);
        
    }
    public boolean dfs(String word,Node current,int idx){
        if(idx==word.length()){
            return current.isEnd;
        }
        char ch=word.charAt(idx);
        if(ch!='.'){
            int childidx=ch-'a';
            if(current.children[childidx]==null){
                return false;
            }
            return dfs(word,current.children[childidx],idx+1);

        }
        for(int i=0;i<26;i++){
            if(current.children[i]!=null){
                if(dfs(word,current.children[i],idx+1)){
                    return true;
                }
            }

        }
        return false;
    }
}
