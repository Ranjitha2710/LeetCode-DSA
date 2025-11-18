
DATE : 18-NOV-2025
LEVEL : Medium
TOPIC : Stack

class MinStack {
    Stack<int []> s;
    public MinStack() {
        s=new Stack<>();
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            s.push(new int[]{val,val});
        }else{
            int currMin=s.peek()[1];
            int newMin=Math.min(val,currMin);
            s.push(new int[]{val,newMin});
        }
        
    }
    
    public void pop() {
        // if(!s.isEmpty()){
        //     s.pop();
        // }
         s.pop();
    }
    
    public int top() {
        // if(!s.isEmpty()){
        //     return s.peek()[0];
        // }
        // return -1;
        return s.peek()[0];
    }
    
    public int getMin() {
        // if(!s.isEmpty()){
        //     return s.peek()[1];
        // }
        // return -1;
        return s.peek()[1];
        
    }
}
