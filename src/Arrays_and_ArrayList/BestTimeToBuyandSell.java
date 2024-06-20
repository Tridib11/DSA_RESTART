package Arrays_and_ArrayList;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyandSell {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minSell=prices[0];
        for(int i=0;i<prices.length;i++){
            minSell=Math.min(minSell,prices[i]);
            int profit=prices[i]-minSell;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
