
DATE : 12-OCT-2025
LEVEL : Medium
TOPIC : 2-Pointer Approach

class Solution {
    public int maxArea(int[] height) {
        int maxWater=0;
        int currentWater=0;
        int lp=0;
        int rp=height.length-1;
        while(lp<rp){
            int ht=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            currentWater=ht*width;
            maxWater=Math.max(maxWater,currentWater);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
}