
DATE : 05-OCT-2025
LEVEL : Medium
TOPIC : Bit Manipulation

class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long power=n;
        if(power<0){
            x=1/x;
            power=-power;
        }
        while(power>0){
            if((power & 1)!=0){
                ans=ans*x;
            }
            x=x*x;
            power=power>>1;
        }
        return ans;
    }
}
