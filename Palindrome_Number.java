
class Solution {
    public boolean isPalindrome(int x) {

      int a = x;
      int count = 0;

      while (a>0) {
        a /= 10;
        count++;
      }

      a = x;

      int[] arr = new int[count];
      int[] arrs = new int[count];

      for (int i = 0; i<arr.length; i++){

        arr[i] = a % 10;
        arrs[count-1-i] = a % 10;

        a/= 10;

      

      }

      boolean isit = true;

      if ( x >= 0) {
        for (int i = 0; i<arr.length; i++) {

          if (arr[i]!= arrs[i]) {
            isit = false;
            break;
          }
        }
      }

      else {
        isit = false;
      }

      return isit;
        
    }
}
