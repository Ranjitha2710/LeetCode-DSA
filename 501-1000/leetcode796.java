
DATE : 28-OCT-2025
LEVEL : Medium
TOPIC : Strings

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String concat=s+s;
        return concat.contains(goal);
        
    }
}