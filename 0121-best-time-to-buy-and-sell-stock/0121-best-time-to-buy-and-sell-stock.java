public class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        
        for (int price : prices) {
           
            if (price < minPrice) {
                minPrice = price;
            } else {
                
                int profit = price - minPrice;
               
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Output: " + solution.maxProfit(prices1)); // Output: 5

        // Example 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Output: " + solution.maxProfit(prices2)); // Output: 0
    }
}
