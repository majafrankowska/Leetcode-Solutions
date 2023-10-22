/*
1425. Constrained Subsequence Sum
Difficulty: Hard

1425_Constrained_Subsequence_Sum.java
*/

class Solution {
  public int constrainedSubsetSum(int[] nums, int k) {
      
    int[] dp = new int[nums.length];
    Deque<Integer> dq = new ArrayDeque<>();

    for (int i = 0; i < nums.length; ++i) {
      if (dq.isEmpty())
        dp[i] = nums[i];
      else
        dp[i] = Math.max(dq.peekFirst(), 0) + nums[i];
      while (!dq.isEmpty() && dq.peekLast() < dp[i])
        dq.pollLast();
      dq.offerLast(dp[i]);
      if (i >= k && dp[i - k] == dq.peekFirst())
        dq.pollFirst();
    }

    return Arrays.stream(dp).max().getAsInt();
  }
}
