/*
2785_Sort_Vowels_in_a_String.java
2785. Sort Vowels in a String
Difficulty: Medium
*/

class Solution {
  public String sortVowels(String s) {
      
    StringBuilder sb = new StringBuilder();
    List<Character> vowels = new ArrayList<>();

    for (final char c : s.toCharArray())
      if (isVowel(c))
        vowels.add(c);

    Collections.sort(vowels);

    int i = 0; 
    for (final char c : s.toCharArray())
      sb.append(isVowel(c) ? vowels.get(i++) : c);

    return sb.toString();
  }

  private boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
      
  }
}
