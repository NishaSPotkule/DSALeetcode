class Trie {
    static class Node{
       Node[]children=new Node[26];
       boolean isEnd=false;

    }
    private Node root;

    public Trie() {
        root=new Node();
        
    }
    
    public void insert(String word) {
        Node current = root;
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
        Node current=root;
        for(char ch:word.toCharArray()){
            int idx=ch-'a';
            if(current.children[idx]==null){
                return false;
            }
            current=current.children[idx];
        }
        return current.isEnd;
        
    }
    
    public boolean startsWith(String prefix) {
        Node current=root;
        for(char ch:prefix.toCharArray()){
            int idx=ch-'a';
            if(current.children[idx]==null){
                return false;
            }
            current=current.children[idx];

        }
        return true;
    }
}
