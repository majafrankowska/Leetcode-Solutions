
/*
338. Counting Bits
Difficulty - Easy 

Counting_Bits.java 
*/


class Solution {
  public int[] countBits(int n) {

    int[] ans = new int[n + 1];

    for (int i = 1; i <= n; ++i)
      ans[i] = ans[i / 2] + (i % 2 == 0 ? 0 : 1);

    return ans;
    
  }
}



