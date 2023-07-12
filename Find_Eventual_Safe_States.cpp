
class Solution {
public:
    vector<int> eventualSafeNodes(vector<vector<int>>& graph) {
        
        int n = graph.size();

        vector<int> a(n,0);
        vector<int> b(n,0);
        vector<int> adj[n];

        for(int i=0; i<n; i++) {
          for(auto &x: graph[i]) {
            adj[x].push_back(i);
            b[i]++;

          }
        }

        queue<int> q;

        for(int i=0; i<n; i++) {
          if(b[i]==0) {
            q.push(i);
          }
        }

        vector<int> c;
        
        while(!q.empty()) {
          int node = q.front();
          c.push_back(node);
          q.pop();

          for(auto x: adj [node]) {
            b[x]--;
            if(b[x]==0) {
              q.push(x);

            }
          }
        }

        sort(c.begin(), c.end());

        return c;

    }
};
