class Solution {
public:
    int change(int amount, vector<int>& coins) {

      vector<int> solution(amount + 1);
      solution[0] = 1;

      for (const int coin: coins) 
        for (int i = coin; i <= amount; ++i)
          solution[i] += solution[i - coin];

      return solution[amount];
        
    }
};
