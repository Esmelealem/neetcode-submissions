class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int minProfit=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minProfit){
                minProfit=prices[i];                
            }
            max=Math.max(max,prices[i]-minProfit);
        }
        return max;        
    }
}
