public class Solution {


  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] prices = {7,1,5,3,6,4};
    int result = solution.maxProfit(prices);
    System.out.println(result);
  }

  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      } else if (prices[i] - minPrice > maxProfit) {
        maxProfit = prices[i] - minPrice;
      }
    }
    return maxProfit;
  }

}
