/*
1647. Minimum Deletions to Make Character Frequencies Unique
Difficulty: Medium

1647_Minimum_Deletions_to_Make_Character_Frequencies_Unique.java
*/

class Solution {
  public int minDeletions(String s) {
      
    int ans = 0;
    int[] count = new int[26];
    Set<Integer> usedFreq = new HashSet<>();

    for (final char c : s.toCharArray())
      ++count[c - 'a'];

    for (int freq : count) {
      while (freq > 0 && usedFreq.contains(freq)) {
        --freq; // Delete ('a' + i).
        ++ans;
      }
      usedFreq.add(freq);
    }

    return ans;
      
  }
}
