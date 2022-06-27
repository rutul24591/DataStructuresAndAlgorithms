package Leetcode.Easy._121.BestTimeToBuyAndSellStock;

import java.util.Arrays;

/*
        @author:    Rutul Amin
        @tag :      Array; Dynamic Programming
        @date:      Jun 27, 2022
        {@link https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ }

        121. Best Time to Buy and Sell Stock

            You are given an array prices where prices[i] is the price of a given stock on the ith day.
            You want to maximize your profit by choosing a single day to buy one stock and
            choosing a different day in the future to sell that stock.

            Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


            Example 1:
                Input: prices = [7,1,5,3,6,4]
                Output: 5
                Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
                Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

            Example 2:
                Input: prices = [7,6,4,3,1]
                Output: 0
                Explanation: In this case, no transactions are done and the max profit = 0.

            Constraints:
                1 <= prices.length <= 105
                0 <= prices[i] <= 104
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < prices.length; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }else if(prices[i] - buy > max_profit){
                max_profit = prices[i] - buy;
            }
        }
        return max_profit;
    }

    public static void main(String[] args){
        BestTimeToBuyAndSellStock instance = new BestTimeToBuyAndSellStock();
        int[] stockPrices = { 7,1,5,3,6,4 };

        System.out.println("Stock Prices: " + Arrays.toString(stockPrices));
        int result = instance.maxProfit(stockPrices);
        System.out.println("Max profit: " + result);
    }
}
