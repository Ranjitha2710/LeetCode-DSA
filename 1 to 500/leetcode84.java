DATE : 17-NOV-2025
LEVEL : Hard
TOPIC : Stack

class Solution {
    public int largestRectangleArea(int[] heights) {
        int Maxarea=0;
        Stack<Integer> s =new Stack<>();
        int nsl[]=new int[heights.length];
        int nsr[]=new int[heights.length];

        //next smaller right
        for(int i=heights.length-1;i>=0;i--){
            while (!s.isEmpty() && heights[s.peek()]>=heights[i]) {
                s.pop();   
            } if (s.isEmpty()) {
                nsr[i]=heights.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        s.clear();
    //next smaller left
    for(int i=0;i<heights.length;i++){
        while (!s.isEmpty() && heights[s.peek()]>=heights[i]) {
            s.pop();
        }if (s.isEmpty()) {
            nsl[i]=-1;  
        }else{
            nsl[i]=s.peek();
        }
        s.push(i);
    }
    for(int i=0;i<heights.length;i++){
        int height=heights[i];
        int width=nsr[i]-nsl[i]-1;
        int currArea=height*width;
        Maxarea=Math.max(Maxarea, currArea);
    }
    return Maxarea;
    }
    
}