/*
342. Power of Four
Difficulty:

342_Power_of_Four.java
*/

class Solution {
  public boolean isPowerOfFour(int n) {
    return n > 0 && Integer.bitCount(n) == 1 && (n - 1) % 3 == 0;
  }
}


// Why (4^n - 1) % 3 == 0?
    // (4^n - 1) = (2^n - 1)(2^n + 1) and 2^n - 1, 2^n, 2^n + 1 are
    // Three consecutive numbers; among one of them, there must be a multiple
    // Of 3, and that can't be 2^n, so it must be either 2^n - 1 or 2^n + 1.
    // Therefore, 4^n - 1 is a multiple of 3
