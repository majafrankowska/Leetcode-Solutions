/*
1921. Eliminate Maximum Number of Monsters
Difficulty: Medium

1921_Eliminate_Maximum_Number_of_Monsters.java
*/

class Solution {
  public int eliminateMaximum(int[] dist, int[] speed) {

    final int n = dist.length;
    int[] arrivalTime = new int[n];

    for (int i = 0; i < n; ++i)
      arrivalTime[i] = (dist[i] - 1) / speed[i];

    Arrays.sort(arrivalTime);

    for (int i = 0; i < n; ++i)
      if (i > arrivalTime[i])
        return i;

    return n;

  }
}
