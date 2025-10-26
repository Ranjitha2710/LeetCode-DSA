
DATE : 26-OCT-2025
LEVEL : Medium
TOPIC : Strings


class Solution {
    public String reverseWords(String s) {
        int left=0;
        int right=s.length()-1;
        String temp="";
        String ans="";
        while (left <= right && s.charAt(left) == ' '){
         left++;
        }
        while (right >= 0 && s.charAt(right) == ' '){
            right--;
        }
        while(left<=right){
            char ch=s.charAt(left);
            if(ch!=' '){
                temp+=ch;
            }else if(ch==' '){
                if(!temp.equals("")){
                    if(!ans.equals("")){
                    ans=temp+' '+ans;
                }else{
                    ans=temp;
                }
                temp="";
            }
        }
            left++;
        }
        if(!temp.equals("")){
            if(!ans.equals("")){
                ans=temp+' '+ans;
            }else{
                ans=temp;
            }
        }
        return ans;
        
    }
}