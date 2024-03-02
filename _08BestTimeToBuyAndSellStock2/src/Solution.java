import java.util.ArrayList;
import java.util.List;

public class Solution {



  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] prices = {7,1,5,3,6,4};
    int result = solution.maxProfit(prices);
    System.out.println(result);
  }

  public int maxProfit(int[] prices) {

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < prices.length - 1; i++) {
      if (prices[i] < prices[i + 1]) {
        list.add(prices[i + 1] - prices[i]);
      }
    }

    int maxProfit = 0;
    for (int i = 0; i < list.size(); i++) {
      maxProfit += list.get(i);
    }
    return maxProfit;

  }

}


