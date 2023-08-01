class Solution {
 public:
  vector<vector<int>> combine(int n, int k) {
    vector<vector<int>> solution;
    dfs(n, k, 1, {}, solution);
    return solution;
  }

 private:
  void dfs(int n, int k, int s, vector<int>&& path, vector<vector<int>>& solution) {
    if (path.size() == k) {
      solution.push_back(path);
      return;
    }

    for (int i = s; i <= n; ++i) {
      path.push_back(i);
      dfs(n, k, i + 1, move(path), solution);
      path.pop_back();
    }
  }
};
