class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long>stack=new Stack<>();
        for(int i=0;i<nums.length;i++){
            long n=(long)nums[i];
            if(stack.isEmpty() || stack.peek()!=n){
                stack.push(n);
            }
            else{
                
           
            while(!stack.isEmpty() && stack.peek()==n){
                Long top=stack.pop();
                n+=top;
              

            
            }
            stack.push(n);
            }
            
        }
        ArrayList<Long>list=new ArrayList<>();
        while(!stack.isEmpty()){
            list.add((long)stack.pop());


        }
        Collections.reverse(list);
        return list;
        
    }
}