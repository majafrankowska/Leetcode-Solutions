459. Repeated Substring Pattern 
Difficulty - Easy

Repeated_Substring_Pattern.java

  class Solution {
    public boolean repeatedSubstringPattern(String s) {
      final String solution = s + s;

      return solution.substring(1, solution.length() - 1).contains(s);
        
    }
}
