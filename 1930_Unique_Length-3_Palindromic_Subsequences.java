/*
1930_Unique_Length-3_Palindromic_Subsequences.java
1930. Unique Length-3 Palindromic Subsequences
Difficulty: Medium
*/

class Solution {
  public int countPalindromicSubsequence(String s) {
      
    int ans = 0;
    int[] first = new int[26];
    int[] last = new int[26];

    Arrays.fill(first, s.length());

    for (int i = 0; i < s.length(); ++i) {
      final int index = s.charAt(i) - 'a';
      first[index] = Math.min(first[index], i);
      last[index] = i;
    }

    for (int i = 0; i < 26; ++i)
      if (first[i] < last[i])
        ans += s.substring(first[i] + 1, last[i]).chars().distinct().count();

    return ans;
      
  }
}
