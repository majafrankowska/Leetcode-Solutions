/*
1624_Largest_Substring_Between_Two_Equal_Characters.java
1624. Largest Substring Between Two Equal Characters
Difficulty: Easy
*/

class Solution {
  public int maxLengthBetweenEqualCharacters(String s) {
      
    int ans = -1;
    int[] lastSeen = new int[26];
    Arrays.fill(lastSeen, -1);

    for (int i = 0; i < s.length(); ++i) {
      final int c = s.charAt(i) - 'a';
      if (lastSeen[c] == -1)
        lastSeen[c] = i;
      else
        ans = Math.max(ans, i - lastSeen[c] - 1);
    }

    return ans;
      
  }
}
