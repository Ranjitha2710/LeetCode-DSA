
DATE : 29-OCT-2025
LEVEL : Easy
TOPIC : String (counting approach)

class Solution {
    public int maxDepth(String s) {
        int currentCount=0;
        int maxCount=0;
        for(char ch :s.toCharArray()){
            if(ch=='('){
                currentCount++;
                 maxCount=Math.max(maxCount,currentCount);
            }else if(ch==')'){
                currentCount--;

            }
        }
        return maxCount;
    }
}