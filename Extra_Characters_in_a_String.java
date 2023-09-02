/*
2707. Extra Characters in a String
Difficulty - Medium 

Extra_Characters_in_a_String.java
*/

class Solution {
  public int minExtraChar(String s, String[] dictionary) {
    
    final int n = s.length();
    Set<String> dictionarySet = new HashSet<>(Arrays.asList(dictionary));
    int[] dp = new int[n + 1];
    Arrays.fill(dp, n);
    dp[0] = 0;

    for (int i = 1; i <= n; i++)
      for (int j = 0; j < i; j++)
        if (dictionarySet.contains(s.substring(j, i)))
          dp[i] = Math.min(dp[i], dp[j]);
        else
          dp[i] = Math.min(dp[i], dp[j] + i - j);

    return dp[n];
    
  }
}
