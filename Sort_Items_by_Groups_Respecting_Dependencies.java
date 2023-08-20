// 1203. Sort Items by Groups Respecting Dependencies
// Difficulty - Hard

class Solution {
  public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
    
    List<Integer>[] graph = new List[n + m];
    int[] inDegree = new int[n + m];

    for (int i = 0; i < graph.length; ++i)
      graph[i] = new ArrayList<>();

    for (int i = 0; i < group.length; ++i) {
      if (group[i] == -1)
        continue;
      graph[group[i] + n].add(i);
      ++inDegree[i];
    }

    for (int i = 0; i < beforeItems.size(); ++i)
      for (final int b : beforeItems.get(i)) {
        final int u = group[b] == -1 ? b : group[b] + n;
        final int v = group[i] == -1 ? i : group[i] + n;
        if (u == v) { 
          graph[b].add(i);
          ++inDegree[i];
        } else {
          graph[u].add(v);
          ++inDegree[v];
        }
      }

    List<Integer> ans = new ArrayList<>();

    for (int i = 0; i < n + m; ++i)
      if (inDegree[i] == 0) 
        dfs(graph, i, inDegree, n, ans);

    return ans.size() == n ? ans.stream().mapToInt(Integer::intValue).toArray() : new int[] {};
  }

  private void dfs(List<Integer>[] graph, int u, int[] inDegree, int n, List<Integer> ans) {
    
    if (u < n) {
      ans.add(u);
    }

    inDegree[u] = -1; 

    for (final int v : graph[u]) 
      if (--inDegree[v] == 0)
        dfs(graph, v, inDegree, n, ans);
  }
}
