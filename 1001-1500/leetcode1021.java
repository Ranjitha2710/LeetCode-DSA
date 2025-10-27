
DATE : 25-OCT-2025
LEVEL : Easy
TOPIC : String (counter approach) 
 You can also go with Stack but Space Complexity will be O(n)

class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(count>0){
                ans.append(ch);
                }
                count++;
            }else{
                count--;
                if(count>0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
        
    }
}