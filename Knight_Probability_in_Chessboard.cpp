class Solution {
public:
    double knightProbability(int n, int k, int row, int column) {

      constexpr double KnightProbalibity = 0.125;
      const vector<pair<int, int>> directions{{-2,1}, {-1,2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};

      vector<vector<double>> v(n, vector<double>(n));
      v[row][column] = 1.0;

      for (int K = 0; K < k; ++K) {
        vector<vector<double>> newv(n, vector<double>(n));
        for (int i = 0; i < n; ++i){
          for (int j = 0; j < n; ++j) {
            if ( v[i][j] > 0.0) {
              for (const auto& [dx, dy] : directions) {
                const int x = i + dx;
                const int y = j + dy;
            
              if (x < 0 || x >= n || y < 0 || y >= n) {
                continue;
              }
              newv[x][y] += v[i][j] * KnightProbalibity; }
            }
          }
        }
        v = move(newv);
      }

      return accumulate(v.begin(), v.end(), 0.0, []( double s, const vector<double>& row) {
        return s + accumulate(row.begin(), row.end(), 0.0);
      });

    }
};
