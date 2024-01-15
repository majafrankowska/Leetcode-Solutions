/*
1359. Count All Valid Pickup and Delivery Options
Difficulty: Hard 

1359_Count_All_Valid_Pickup_and_Delivery_Options.java
*/


class Solution {
  public int countOrders(int n) {
      
    final int kMod = 1_000_000_007;
    long ans = 1;

    for (int i = 1; i <= n; ++i)
      ans = ans * i * (i * 2 - 1) % kMod;

    return (int) ans; 
      
  }
}
