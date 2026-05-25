class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i=0;i<prices.length;i++){
            int sell = prices[i];
            int newProfit = sell-buy;
             profit = Math.max(profit,newProfit);
            if(sell < buy){
                buy=sell;
            }
            System.out.println("sell"+sell);
            System.out.println("buy"+buy);
        }
        return profit;
    }
}
