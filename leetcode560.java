
DATE : 16-OCT-2025
LEVEL : Medium
TOPIC : Arrays

Brute Force --->TC : O(n²)

class Solution {
    public int subarraySum(int[] nums, int k) {
      
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }

            }
        }
        return count;
        
    }
}