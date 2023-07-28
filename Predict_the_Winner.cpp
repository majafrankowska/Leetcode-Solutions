class Solution {
public:
    bool PredictTheWinner(vector<int>& nums) {
        
        const int n = nums.size();
        vector<vector<int>> v(n, vector<int>(n));
        
        for (int i = 0; i < n; ++i) {
            v[i][i] = nums[i];
        }
        
        for ( int i = 1; i < n; ++i) {
            for (int j = 0; i + j < n; ++j) {
                const int k = i + j;
                v[j][k] = max(nums[j] - v[j + 1][k], nums[k] - v[j][k - 1]);
            }
        }
        
        return v[0][n - 1] >= 0;
    }
};
