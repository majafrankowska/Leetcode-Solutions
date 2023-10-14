/*
2742. Painting the Walls
Difficulty: Hard

2742_Painting_the_Walls.java
*/

class Solution {
  public int paintWalls(int[] cost, int[] time) {
      
    final int kMax = 500_000_000;
    final int n = cost.length;
    int[] dp = new int[n + 1];
      
    Arrays.fill(dp, kMax);
      
    dp[0] = 0;

    for (int i = 0; i < n; ++i)
      for (int walls = n; walls > 0; --walls)
        dp[walls] = Math.min(dp[walls], dp[Math.max(walls - time[i] - 1, 0)] + cost[i]);

    return dp[n];
      
  }
}
