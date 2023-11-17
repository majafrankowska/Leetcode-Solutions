/*
1877_Minimize_Maximum_Pair_Sum_in_Array.java
1877. Minimize Maximum Pair Sum in Array
Difficulty: Medium
*/

class Solution {
  public int minPairSum(int[] nums) {
      
    int ans = 0;

    Arrays.sort(nums);

    for (int i = 0, j = nums.length - 1; i < j;)
      ans = Math.max(ans, nums[i++] + nums[j--]);

    return ans;
      
  }
}
