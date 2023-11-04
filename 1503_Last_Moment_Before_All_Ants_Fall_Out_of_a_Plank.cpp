/*
1503. Last Moment Before All Ants Fall Out of a Plank
Difficulty:

1503_Last_Moment_Before_All_Ants_Fall_Out_of_a_Plank.cpp
*/

class Solution {
 public:
  int getLastMoment(int n, vector<int>& left, vector<int>& right) {
    const int maxLeft = left.empty() ? 0 : ranges::max(left);
    const int minRight = right.empty() ? n : ranges::min(right);
    return max(maxLeft, n - minRight);
  }
};
