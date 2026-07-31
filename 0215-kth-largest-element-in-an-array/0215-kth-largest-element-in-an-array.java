class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:nums){
            pq.offer(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[]res=new int[k];
        for(int i=k-1;i>=0;i--){
            res[i]=pq.poll();
        }
        return res[res.length-1];
        
    }
}