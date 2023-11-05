/*
1535. Find the Winner of an Array Game
Difficulty: Medium

1535_Find_the_Winner_of_an_Array_Game.java
*/

class Solution {
    public int getWinner(int[] arr, int k) {
        
        int ans = arr[0];
        int wins = 0;
        
        for (int i = 1; i < arr.length && wins < k; ++i){
            if (arr[i] > ans) {
                ans = arr[i];
                wins = 1;
            }
            
            else {
                ++wins;
                
            }
        }
        
        return ans;
        
    }
}
