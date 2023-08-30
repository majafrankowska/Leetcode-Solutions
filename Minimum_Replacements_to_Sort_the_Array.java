/*2366. Minimum Replacements to Sort the Array
Difficulty - Hard*/

// Minimum_Replacements_to_Sort_the_Array.java

class Solution {
  public long minimumReplacement(int[] nums) {
    long ans = 0;

    int max = nums[nums.length - 1];
    for (int i = nums.length - 2; i >= 0; --i) {
      final int ops = (nums[i] - 1) / max;
      ans += ops;
      max = nums[i] / (ops + 1);
    }

    return ans;
  }
}
