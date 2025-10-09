
DATE : 01-OCT-2025
LEVEL : Easy
TOPIC : Bit Manipulation(XOR)


class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res^=nums[i];
        }
        return res;   
    }
}