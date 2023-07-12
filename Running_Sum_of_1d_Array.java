class Solution {
    public int[] runningSum(int[] nums) {

      int total = nums[0];
      int howbig = nums.length;
      int[] totally = new int[howbig];
      totally[0] = nums[0];

      for (int i = 1; i< nums.length; i++) {

        total += nums[i];
        totally[i]=total;

      }

      return totally;
    }
}
