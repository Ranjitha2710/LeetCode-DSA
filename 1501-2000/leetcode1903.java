
DATE : 27-OCT-2025
LEVEL : Easy
TOPIC : String 

class Solution {
    public String largestOddNumber(String num) {
        int idx=-1;
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0') % 2 == 1){
                idx=i;
                break;
            }
        }
        int j=0;
        while(j<=idx && num.charAt(j) == '0'){
            j++;
        }
        return num.substring(j,idx+1);  
    }
}