/*
1420. Build Array Where You Can Find The Maximum Exactly K Comparisons
Difficulty: Hard 

1420_Build_Array_Where_You_Can_Find_The_Maximum_Exactly_K_Comparisons.java
*/

class Solution {
  public int numOfArrays(int n, int m, int k) {
    
    final int kMod = 1_000_000_007;
    int[][][] dp = new int[n + 1][m + 1][k + 1];

    for (int j = 1; j <= m; ++j)
      dp[1][j][1] = 1;

    for (int i = 2; i <= n; ++i)                
      for (int j = 1; j <= m; ++j)              
        for (int cost = 1; cost <= k; ++cost) {
    
          dp[i][j][cost] = (int) ((long) j * dp[i - 1][j][cost] % kMod);
         
          for (int prevMax = 1; prevMax < j; ++prevMax) {
            dp[i][j][cost] += dp[i - 1][prevMax][cost - 1];
            dp[i][j][cost] %= kMod;
          }
        }

    int ans = 0;
    for (int j = 1; j <= m; ++j) {
      ans += dp[n][j][k];
      ans %= kMod;
    }
    
    return ans;
  }
}
