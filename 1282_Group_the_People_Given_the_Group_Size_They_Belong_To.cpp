/*
1282. Group the People Given the Group Size They Belong To
Difficulty: Medium

1282_Group_the_People_Given_the_Group_Size_They_Belong_To.cpp
*/


class Solution {

 public:
  vector<vector<int>> groupThePeople(vector<int>& groupSizes) {
    
    vector<vector<int>> ans; 
    unordered_map<int, vector<int>> groupSizeToIndices;

    for (int i = 0; i < groupSizes.size(); ++i)
      groupSizeToIndices[groupSizes[i]].push_back(i); 

    for (const auto& [groupSize, indices] : groupSizeToIndices) {
      vector<int> groupIndices;
      for (const int index : indices) {
        groupIndices.push_back(index);
        if (groupIndices.size() == groupSize) {
          ans.push_back(groupIndices);
          groupIndices.clear();
        }
      }
    }

    return ans;
    
  }
}; 
 
