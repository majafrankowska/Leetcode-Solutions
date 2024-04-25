/*
1269. Number of Ways to Stay in the Same Place After Some Steps
Difficulty:

1269_Number_of_Ways_to_Stay_in_the_Same_Place_After_Some_Steps.java
*/
 
class Solution {   
  public int numWays(int steps, int arrLen) {
 
    final int kMod = 1_000_000_007;
    final int n = Math.min(arrLen, steps / 2 + 1);  

    long[] dp = new long[n]; 
    dp[0] = 1;

    while (steps-- > 0) { 
      long[] newDp = new long[n];
      for (int i = 0; i < n; ++i) {
        newDp[i] = dp[i];
        if (i - 1 >= 0)
          newDp[i] += dp[i - 1];
        if (i + 1 < n)
          newDp[i] += dp[i + 1];
        newDp[i] %= kMod;
      }
      dp = newDp;
    }

    return (int) dp[0];

  }
}
