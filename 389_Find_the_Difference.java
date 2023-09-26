/*
389. Find the Difference
Difficulty: Easy

389_Find_the_Difference.java
*/

class Solution {
  public char findTheDifference(String s, String t) {
    
    char solution = 0;

    for (final char c : s.toCharArray())
      solution ^= c;

    for (final char c : t.toCharArray())
      solution ^= c;

    return solution;
    
  }
}
