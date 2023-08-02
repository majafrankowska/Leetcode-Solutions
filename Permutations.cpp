class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {

      vector<vector<int>> solution;

      // depth-first search (dfs)
      dfs(nums, vector<bool>(nums.size()), {}, solution);
      return solution;
    }

    private:
      void dfs(const vector<int>& nums, vector<bool>&& used, vector<int>&& path, vector<vector<int>>& solution) {
        if (path.size() == nums.size()) {
          solution.push_back(path);
          return;
        }

        for (int i = 0; i < nums.size(); ++i) {
          if (used[i]) {
            continue;
          }

          used[i] = true;
          path.push_back(nums[i]);
          dfs(nums, move(used), move(path), solution);
          path.pop_back();
          used[i] = false;
        }
      }
};
