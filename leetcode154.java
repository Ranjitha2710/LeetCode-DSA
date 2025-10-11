
DATE : 11-OCT-2025
LEVEL : Hard
TOPIC : Binary Search 

class Solution {
    public int findMin(int[] nums) {
        int mid;
        int start=0;
        int end=nums.length-1;
        while(start<end){
            mid=start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }else if(nums[mid]<nums[end]){
                end=mid;
            }else{
                end--;
            }
        }
        return nums[start];
        
    }
}