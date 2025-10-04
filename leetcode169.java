
// DATE : 02-OCT-2025
// LEVEL : Easy
// TOPIC : Boyer-Moore-Algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            count+=nums[i]==candidate?1:-1;
        }
        return candidate;
        
    }
}