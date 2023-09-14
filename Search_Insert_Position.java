/*
35. Search Insert Position
Difficulty: Easy 

Search_Insert_Position.java
*/

class Solution {
  public int searchInsert(int[] nums, int target) {
      
    int l = 0;
    int r = nums.length;

    while (l < r) {
      final int m = (l + r) / 2;
      if (nums[m] == target)
        return m;
      if (nums[m] < target)
        l = m + 1;
      else
        r = m;
    }

    return l;
      
  }
}

