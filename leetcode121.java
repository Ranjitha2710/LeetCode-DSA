
// DATE : 04-OCT-2025
// LEVEL : Easy
// TOPIC : Arrays 

class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice=prices[0];
        int profit;
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(buyPrice<prices[i]){
                profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
        
    }
}