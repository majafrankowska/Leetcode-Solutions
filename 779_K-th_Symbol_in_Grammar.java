/*
779. K-th Symbol in Grammar
Difficulty: Medium

779_K-th_Symbol_in_Grammar.java
*/

class Solution {
  public int kthGrammar(int n, int k) {
    if (n == 1)
      return 0;
    if (k % 2 == 1)
      return kthGrammar(n - 1, (k + 1) / 2) == 0 ? 0 : 1; // this is left node
    return kthGrammar(n - 1, k / 2) == 0 ? 1 : 0;         // this is right node
  }
}
