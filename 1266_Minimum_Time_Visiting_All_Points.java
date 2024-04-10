/*
1266_Minimum_Time_Visiting_All_Points.java
1266. Minimum Time Visiting All Points
Difficulty: Easy
*/ 

class Solution {   
  public int minTimeToVisitAllPoints(int[][] points) {   
    int ans = 0;
 
    for (int i = 1; i < points.length; ++i)
      ans += Math.max(Math.abs(points[i][0] - points[i - 1][0]),
                      Math.abs(points[i][1] - points[i - 1][1]));
    return ans;
    
  }
}
