package problems.java;

public class BestTimeToBuyAndSellStockII122 {

    public int maxProfit(int[] prices) {

        int left = 0;
        int right = 0;

        int maxProfit = 0;

        // traverse the array using the left and right pointer

        for (right = left + 1; right < prices.length; right++) {
            if(prices[right] <= prices[left]){
                left++;
            } else {
                // add profit
                maxProfit += prices[right] - prices[left];
                left = right;
            }
        }

        return maxProfit;
    }
}
