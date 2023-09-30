/*
456. 132 Pattern
Difficulty:

456_132_Pattern.java
*/

class Solution {
  public boolean find132pattern(int[] nums) {
    
    Deque<Integer> stack = new ArrayDeque<>(); 
    int ak = Integer.MIN_VALUE;              

    for (int i = nums.length - 1; i >= 0; --i) {
      if (nums[i] < ak)
        return true;
      while (!stack.isEmpty() && stack.peek() < nums[i])
        ak = stack.pop();
      stack.push(nums[i]); 
    }

    return false;
    
  }
}
