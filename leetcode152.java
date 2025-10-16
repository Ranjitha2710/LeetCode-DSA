
DATE : 16-OCT-2025
LEVEL : Medium
TOPIC : Some math + DP

class Solution {
    public int maxProduct(int[] nums) {
        int maxProd=nums[0];
        int minProd=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=maxProd;
                maxProd=minProd;
                minProd=temp;
            }
            maxProd=Math.max(nums[i],maxProd*nums[i]);
            minProd=Math.min(nums[i],minProd*nums[i]);
            ans=Math.max(ans,maxProd);
        }
        return ans;
        
    }
}