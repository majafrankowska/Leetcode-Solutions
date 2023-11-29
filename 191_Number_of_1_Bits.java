/*
Difficulty: Eazy
191. Number of 1 Bits
191_Number_of_1_Bits.java
*/

public class Solution {
  public int hammingWeight(int n) {
      
    int solution = 0;

    for (int i = 0; i < 32; ++i)
      if (((n >> i) & 1) == 1)
        ++solution;

    return solution;
      
  }
}
