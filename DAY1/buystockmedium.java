class buystockmedium {

    public int maxProfit(int[] prices) {

        // This variable stores the total profit earned.
        int profit = 0;

        // Start from the second day because
        // we compare today's price with yesterday's price.
        for (int i = 1; i < prices.length; i++) {

            // Check if today's price is greater than yesterday's.
            if (prices[i] > prices[i - 1]) {

                // Add only the positive profit.
                profit = profit + (prices[i] - prices[i - 1]);
            }
        }

        // Return the total profit after scanning all days.
        return profit;
    }

    public static void main(String[] args) {
        buystockmedium obj = new buystockmedium();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = obj.maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);
    }
}