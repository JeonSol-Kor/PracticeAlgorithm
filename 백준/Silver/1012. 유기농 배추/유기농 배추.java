import java.io.*;
import java.util.*;

public class Main {
    private static int M, N;
    private static int[][] field;
    
    private static void dfs(int x, int y) {
        // 현재 위치를 방문 처리
        field[y][x] = 0;
        // 상하좌우 탐색
        int[] dxs = {-1, 1, 0, 0};
        int[] dys = {0, 0, -1, 1};
        for (int i = 0; i < 4; i++) {
            int nx = x + dxs[i];
            int ny = y + dys[i];
            // 범위 안에 있고, 배추가 있는 곳이면 재귀적으로 DFS 실행
            if (0 <= nx && nx < M && 0 <= ny && ny < N && field[ny][nx] == 1) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine().trim());
        
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            field = new int[N][M];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                field[Y][X] = 1;
            }

            int count = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (field[j][i] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            
            sb.append(count).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}
