
DATE : 19-NOV-2025
LEVEL : Medium
TOPIC : Stack(u can go with arraylist also)

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int a : asteroids){
            boolean destroy=false;
        //when negative(say num) comes n top of stack is postive
            while(!s.isEmpty() && s.peek()>0 && a<0){
                int top=s.peek();
    // top of stack is less than abs(num)
                if(top<-a){
                    s.pop();
                }
    //both are equal(num and top of stack) but one is pos and other is negative destroy time
                else if(top==-a){ 
                    s.pop();
                    destroy=true;
                    break;
                }
// // top of stack is gretaer than abs(num),,destroy incame num 
                else{
                    destroy=true;
                    break;
                }
            }
//when incoming num is positive or stack empty and negative num remain in asteroid
            if(!destroy){
                s.push(a);
            }
        }
//stak to array conversion
        int ans[]=new int[s.size()];
        for(int i=0;i<s.size();i++){
            ans[i]=s.get(i);
        }
        return ans;
    }
}
        
