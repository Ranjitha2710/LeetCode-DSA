
DATE : 06-OCT-2025
LEVEL : Medium
TOPIC : Arrays (u can use prefix sum also but Time complexity will be O(n2))

class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currSum=Math.max(nums[i],currSum+nums[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}