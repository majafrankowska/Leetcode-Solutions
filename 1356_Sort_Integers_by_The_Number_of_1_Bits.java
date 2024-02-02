/*
1356. Sort Integers by The Number of 1 Bits
Difficulty:

1356_Sort_Integers_by_The_Number_of_1_Bits.java
*/

class Solution {  
 public:
  vector<int> sortByBits(vector<int>& arr) {
    ranges::sort(arr, [](const int a, int b) {
      const int x = bitset<32>(a).count();
      const int y = bitset<32>(b).count();
      return x == y ? a < b : x < y; 
    });
    return arr; 
  }
};
