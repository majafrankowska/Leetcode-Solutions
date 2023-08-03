class Solution {
  public:
    vector<string> letterCombinations(string digits) {
        if (digits.empty()) {
          return {};
        }

        vector<string> solution;
        dfs(digits, 0, "", solution);
        
        return solution;
    }

  private:
  const vector<string> dToL { "",    "",    "abc",  "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

  void dfs(const string& digits, int i, string&& path, vector<string>& solution) {
    if (i == digits.length()) {
      solution.push_back(path);
      return;
    }

    for (const char letter : dToL[digits[i] - '0']) {
      path.push_back(letter);
      dfs(digits, i + 1, move(path), solution);
      path.pop_back();
    }
  }
    
};
