class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            pq.offer(new int[]{e.getKey(),e.getValue()});
            if(pq.size()>k){
                pq.poll();
            }
        }

        int[]res=new int[k];
        for(int i=k-1;i>=0;i--){
            res[i]=pq.poll()[0];
        }
        return res;
        
    }
}