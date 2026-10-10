class Solution {
    public int trap(int[] height) {


        int n=height.length;
        int water=0;
      
        int[]leftmax=new int[n];
        int[]rightmax=new int[n];
        leftmax[0]=height[0];

            for(int j=1;j<n;j++){
                leftmax[j]=Math.max(height[j],leftmax[j-1]);

            }
            rightmax[n-1]=height[n-1];
            for(int j=n-2;j>=0;j--){
                rightmax[j]=Math.max(height[j],rightmax[j+1]);
            }
           for(int i=0;i<n;i++){
            water+=Math.min(leftmax[i],rightmax[i])-height[i];
           }
        return water;

        
    }
}