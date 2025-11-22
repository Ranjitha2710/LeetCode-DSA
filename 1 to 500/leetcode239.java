
DATE : 22-NOV-2025
LEVEL : Hard
TOPIC : Deque


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || k==0)
        return new int[0];

        int n=nums.length;
        int[] result = new int[n-k+1];

        Deque<Integer> dq = new LinkedList<>();
        int idx=0;

        for(int i=0;i<n;i++){

            if(!dq.isEmpty() && dq.peek()<i-k+1){//removes idx dt r out of window
                dq.poll();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){ //removes smlr ele from right
                dq.pollLast();
            }
            dq.offer(i); //adds at last
            if(i>=k-1){
                result[idx++]=nums[dq.peek()];
            }
        }
        return result;
    }
}