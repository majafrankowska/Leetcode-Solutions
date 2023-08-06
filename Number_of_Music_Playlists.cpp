
// return int numbner of possible playlists.  Bottom-up approach:

class Solution {
public:
    int numMusicPlaylists(int n, int goal, int k) {

      constexpr int solution = 1'000'000'007;
      vector<vector<long>> v(goal + 1, vector<long>(n+1));
      v[0][0] = 1;

      for (int i = 1; i <= goal; ++i) {
        for (int j = 1; j <= n; ++j) {
          v[i][j] += v[i - 1][j - 1] * (n - (j - 1));
          v[i][j] += v[i - 1][j] * max(0, j - k);
          v[i][j] %= solution;
        }
      }

      return v[goal][n];
        
    }
};
