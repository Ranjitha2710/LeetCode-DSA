
DATE : 03-NOV-2025
LEVEL : Easy
TOPIC : Arrays

class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=1;
        int n=nums.length;
        if(n==0){
            return 0;
        }
        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i]){
                nums[idx]=nums[i];
                idx++;
            }
          
        }
        return idx;
        
    }
}