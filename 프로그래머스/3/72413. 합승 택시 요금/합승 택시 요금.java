import java.util.*;

class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        // 무한대를 나타내는 값 설정
        final int INF = 200 * 100000; // 최대 지점 수 * 최대 요금

        // 모든 지점 간의 최단 거리를 저장할 2차원 배열 초기화
        int[][] dist = new int[n + 1][n + 1];
        
        // 초기화: 자기 자신으로 가는 거리는 0, 그 외는 INF로 설정
        for (int i = 1; i <= n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        // 주어진 fares 배열을 이용하여 인접 행렬 설정
        for (int[] fare : fares) {
            int c = fare[0];
            int d = fare[1];
            int f = fare[2];
            // 양방향 그래프이므로 양쪽 모두 업데이트
            if (f < dist[c][d]) { // 이미 더 작은 값이 있을 수 있으므로 확인
                dist[c][d] = f;
                dist[d][c] = f;
            }
        }

        // 플로이드-워셜 알고리즘 수행
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    // i에서 k를 거쳐 j로 가는 비용이 더 작으면 업데이트
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // 모든 지점을 합승 지점으로 고려하여 최저 요금 계산
        int answer = INF;
        for (int k = 1; k <= n; k++) {
            // s에서 k까지, k에서 a까지, k에서 b까지의 합산 비용
            int totalFare = dist[s][k] + dist[k][a] + dist[k][b];
            if (totalFare < answer) {
                answer = totalFare;
            }
        }

        return answer;
    }
}
