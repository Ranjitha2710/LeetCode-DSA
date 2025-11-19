
DATE : 10-OCT-2025
LEVEL : Medium
TOPIC : Prefix and Suffix Multiplication

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        ans[0]=1;
//left product of num except itself
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
    //multipy right prod with left prod, 
    // means include right side element fr product
        int rightProduct=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=rightProduct;
            rightProduct*=nums[i];
        }
        return ans;
    }
}