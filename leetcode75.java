
DATE : 22-OCT-2025
LEVEL : Medium
TOPIC : 3-Pointer Approach 
/*
 Go through the Dutch National Flag alogrithm for bettter understanding.
 */

class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(mid<=end){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[start];
                nums[start]=temp;
                mid++;
                start++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[end];
                nums[end]=temp;
                end--;
            }
        }
        
        
    }
}