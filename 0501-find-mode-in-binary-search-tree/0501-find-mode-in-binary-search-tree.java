/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
       
        
        HashMap<Integer,Integer>map=new HashMap<>();
       
        inorder(root,map);

         int max=0;
        for(int val:map.values()){
            max=Math.max(max,val);
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            int key=e.getKey();
            int val=e.getValue();
            if(val==max){
               list.add(key);

            }

        }
        int[]arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);

        }
        return arr;

        
    }
    void inorder(TreeNode root,HashMap<Integer,Integer>map){
        if(root==null){
            return;
        }
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        inorder(root.left,map);
        inorder(root.right,map);
    }
}