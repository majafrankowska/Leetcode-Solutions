# 1584. Min Cost to Connect All Points
# Difficulty: Medium

# 1584_Min_Cost_to_Connect_All_Points.py

class Solution:
  def minCostConnectPoints(self, points: List[int]) -> int:

    dist = [math.inf] * len(points)
    ans = 0

    for i in range(len(points) - 1):
      for j in range(i + 1, len(points)):
        dist[j] = min(dist[j], abs(points[i][0] - points[j][0]) +
                      abs(points[i][1] - points[j][1]))

        if dist[j] < dist[i + 1]:
          points[j], points[i + 1] = points[i + 1], points[j]
          dist[j], dist[i + 1] = dist[i + 1], dist[j]
      ans += dist[i + 1]

    return ans
