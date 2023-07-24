class Solution {
    public String toGoatLatin(String sentence) {
        
      String solution = "";
    final String vowels = "aeiouAEIOU";
    final String[] words = sentence.split(" ");
    int i = 1;

    for (final String word : words) {
      if (i > 1)
        solution += " ";
      if (vowels.contains("" + word.charAt(0)))
        solution += word;
      else
        solution += word.substring(1) + word.charAt(0);
      solution += "ma"
             + "a".repeat(i++);
    }

    return solution;
  }
}
