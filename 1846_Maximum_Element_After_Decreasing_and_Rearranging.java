/*
1846_Maximum_Element_After_Decreasing_and_Rearranging.java
1846. Maximum Element After Decreasing and Rearranging
Difficulty: Medium
*/

class Solution {
  public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
      
    Arrays.sort(arr);
    arr[0] = 1;

    for (int i = 1; i < arr.length; ++i)
      arr[i] = Math.min(arr[i], arr[i - 1] + 1);

    return arr[arr.length - 1];
      
  }
}
