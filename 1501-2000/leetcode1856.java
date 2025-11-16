

DATE : 16-NOV-2025
LEVEL : Medium
TOPIC : Stack,prefix sum

class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n=nums.length;
        long[] prefix=new long[n+1];
        //prefix sum
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        
        int left[]=new int[n];
        int right[]=new int[n];

        //find previous smaller elemt using stack
        long max=0;
        Stack<Integer> stack = new Stack<>();
         for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            left[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
         }
         stack.clear();
          for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]>nums[i]){
                stack.pop();
            }
            right[i]=stack.isEmpty()? n:stack.peek();
            stack.push(i);
         }
         for(int i=0;i<n;i++){
            int l=left[i]+1;
            int r=right[i]-1;

            long sum=prefix[r+1]-prefix[l];
            long product=sum * nums[i];

            max=Math.max(max,product);
            }
        return (int)(max % 1000000007);

    }
}