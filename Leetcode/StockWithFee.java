public class StockWithFee {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
    }
    public static int maxProfit(int[] prices, int fee) {
        int profit = 0, hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, hold + prices[i] - fee);
            hold = Math.max(hold, profit - prices[i]);
        }
        return profit;
    }
}
