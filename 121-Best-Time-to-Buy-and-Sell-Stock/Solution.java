class Solution {
    public int maxProfit(int[] prices) 
    {
        int lowestPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i] <= lowestPrice)
            {
                lowestPrice = prices[i];
            }

            else if (prices[i] > lowestPrice)
            {
                int profit = prices[i] - lowestPrice;
                if (profit > maxProfit)
                {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}