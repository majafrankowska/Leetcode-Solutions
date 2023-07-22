class Solution {
    public int romanToInt(String s) {
        
        int anwser = 0;
        int[] roman = new int[128];

        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;

        for (int i = 0; i + 1 < s.length(); ++i) {
          if (roman[s.charAt(i)] < roman[s.charAt(i + 1)]) {
            anwser -= roman[s.charAt(i)];
          }
          else {
            anwser += roman[s.charAt(i)];
          }
        }

        anwser += roman[s.charAt(s.length() - 1)];

        return anwser;

    }
}
