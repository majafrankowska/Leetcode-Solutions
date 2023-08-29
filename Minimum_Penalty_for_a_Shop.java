/* 2483. Minimum Penalty for a Shop
Difficulty - Medium */ 

Minimum_Penalty_for_a_Shop.java

class Solution {
  public int bestClosingTime(String customers) {
    
    int ans = 0;
    int profit = 0;
    int maxProfit = 0;

    for (int i = 0; i < customers.length(); ++i) {
      profit += customers.charAt(i) == 'Y' ? 1 : -1;
      if (profit > maxProfit) {
        maxProfit = profit;
        ans = i + 1;
      }
    }

    return ans;
  }
}
