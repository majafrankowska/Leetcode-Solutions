/*
515. Find Largest Value in Each Tree Row
Difficulty: Medium

515_Find_Largest_Value_in_Each_Tree Row.java
*/

class Solution {
  public List<Integer> largestValues(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    dfs(root, 0, ans);
    return ans;
  }

  private void dfs(TreeNode root, int depth, List<Integer> ans) {
    if (root == null)
      return;
    if (depth + 1 > ans.size())
      ans.add(root.val);
    else
      ans.set(depth, Math.max(ans.get(depth), root.val));

    dfs(root.left, depth + 1, ans);
    dfs(root.right, depth + 1, ans);
  }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
