import java.util.*;

public class Solution {
    int n = 0;
    int[] indeg = new int[1000005];
    int[] outdeg = new int[1000005];
    boolean[] vis = new boolean[1000005];
    List<Integer>[] adj = new ArrayList[1000005];
    final int INF = Integer.MAX_VALUE;

    // 생성자에서 인접 리스트 초기화
    public Solution() {
        for (int i = 0; i < 1000005; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    // 중심 정점 찾기 (indegree가 0이고, outdegree가 2 이상인 정점)
    int find_c_node() {
        for (int i = 1; i <= n; i++) {
            if (indeg[i] == 0 && outdeg[i] > 1) {
                return i;
            }
        }
        return -1;  // 중심 정점이 없을 경우
    }

    // DFS 탐색
    int dfs(int node) {
        vis[node] = true;
        int deg = adj[node].size();
        if (deg == 0) return INF;  // 더 이상 이동할 곳이 없으면 막대 그래프로 간주

        for (int nxt : adj[node]) {
            if (!vis[nxt]) {
                deg = Math.max(deg, dfs(nxt));  // 가장 큰 값을 유지
            }
        }
        return deg;
    }

    public int[] solution(int[][] edges) {
        for (int[] e : edges) {
            int u = e[0], v = e[1];
            outdeg[u]++;
            indeg[v]++;
            adj[u].add(v);
            n = Math.max(n, Math.max(u, v));
        }

        int c_node = find_c_node();
        int g1 = 0, g2 = 0, g3 = 0;

        // 중심 정점에서 이어진 그래프 분류
        for (int nxt : adj[c_node]) {
            int val = dfs(nxt);
            if (val == 1) g1++;        // 도넛 그래프
            else if (val == INF) g2++;  // 막대 그래프
            else g3++;                  // 8자 그래프
        }

        // 결과 반환
        return new int[] { c_node, g1, g2, g3 };
    }
}
