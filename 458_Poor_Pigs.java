/*
458. Poor Pigs
Difficulty: Hard

458_Poor_Pigs.java
*/


class Solution {
  public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
    return (int) Math.ceil(Math.log(buckets) / Math.log(minutesToTest / minutesToDie + 1));
  }
}
