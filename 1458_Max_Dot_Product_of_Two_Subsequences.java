/*
1458. Max Dot Product of Two Subsequences
Difficulty: Hard

1458_Max_Dot_Product_of_Two_Subsequences.java
*/

class Solution {
  public int maxDotProduct(int[] nums1, int[] nums2) {
    
    final int m = nums1.length;
    final int n = nums2.length;

    int[][] dp = new int[m + 1][n + 1];
    Arrays.stream(dp).forEach(row -> Arrays.fill(row, Integer.MIN_VALUE));

    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j)
        dp[i + 1][j + 1] = Math.max(Math.max(dp[i][j + 1], dp[i + 1][j]),
                                    Math.max(0, dp[i][j]) + nums1[i] * nums2[j]);

    return dp[m][n];
    
  }
}
