
DATE : 09-OCT-2025
LEVEL : Medium
TOPIC : Binary Search 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int start=0;
        int end=(row*col)-1;
        while(start<=end){
            
            int mid=start+(end-start)/2;//bcoz we assummed array in 1D
            int midEle=matrix[mid/col][mid%col];
            if(target==midEle){
                return true;
            }else if(target>midEle){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
        
    }
}