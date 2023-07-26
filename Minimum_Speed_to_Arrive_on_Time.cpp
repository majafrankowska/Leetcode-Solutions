class Solution {
public:
    int minSpeedOnTime(vector<int>& dist, double hour) {
        
        int solution = -1;
        int left = 1;
        int right = 1e7;
        
        while( left <= right) {
            const int minSpeed = (left + right) / 2;
            if (time(dist, hour, minSpeed) > hour) {
                left = minSpeed + 1;
            } 
            
            else {
                solution = minSpeed;
                right = minSpeed - 1;
                
            }
        }
        
        return solution;
    }
    
    private: 
    double time (const vector<int>& dist, double hour, int speed) {
        double sum = 0;
        for (int i = 0; i < dist.size() - 1; ++i) {
            sum += ceil((double)dist[i] / speed);
        }
        return sum + (double) dist.back() / speed;
    }
};
