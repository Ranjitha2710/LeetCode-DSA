
DATE : 07-OCT-2025
LEVEL : Medium
TOPIC : Arrays

class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        //finding first decreasing element from rightside
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
//finding smalles elemnt from rightside/ nxt greater element and swap
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        reverse(nums,i+1,n-1);
    }
    //helper function to print array
        public static void reverse(int nums[],int start,int end){
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        } 
        //u can have this function if u want or u can discard
        public static void prinOutputtArray(int nums[]){
            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]+ "");
            }
        }
    }
