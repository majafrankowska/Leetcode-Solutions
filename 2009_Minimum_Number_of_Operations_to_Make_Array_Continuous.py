/* 
2009. Minimum Number of Operations to Make Array Continuous
Difficulty: Hard

2009_Minimum_Number_of_Operations_to_Make_Array_Continuous.py
*/

class Solution:
  def minOperations(self, nums: List[int]) -> int:
    
    n = len(nums)
    ans = n
    nums = sorted(set(nums))

    for i, start in enumerate(nums):
      end = start + n - 1
      index = bisect_right(nums, end)
      uniqueLength = index - i
      ans = min(ans, n - uniqueLength)

    return ans
