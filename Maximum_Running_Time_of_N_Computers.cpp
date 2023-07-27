class Solution {
public:
    long long maxRunTime(int n, vector<int>& batteries) {
        long long sum = accumulate(batteries.begin(), batteries.end(), 0LL);
        
        sort(batteries.begin(), batteries.end());
        
        while (batteries.back() > sum / n) {
            sum -= batteries.back(), batteries.pop_back();
            --n;
        }
        
        return sum / n;
    }
};
