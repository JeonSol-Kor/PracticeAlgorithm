import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] map = new String[N];
        for(int i = 0; i < N; i++){
            map[i] = br.readLine();
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        boolean[][] visited = new boolean[N][N];

        Queue<int[]> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i].charAt(j) == '1' && !visited[i][j]){
                    visited[i][j] = true;
                    int cnt = 0;
                    queue.offer(new int[]{i, j});
                    while(!queue.isEmpty()){
                        cnt++;
                        int[] cur  = queue.poll();
                        int cx = cur[0];
                        int cy = cur[1];

                        for(int n = 0; n < 4; n++){
                            int nx = cx + dx[n];
                            int ny = cy + dy[n];

                            if(nx >= 0 && nx < N && ny >= 0 && ny < N && map[nx].charAt(ny) == '1' && !visited[nx][ny]){
                                visited[nx][ny] = true;
                                queue.offer(new int[]{nx, ny});
                            }
                        }
                    }
                    answer.add(cnt);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(answer.size()).append('\n');
        Collections.sort(answer);
        for(int i = 0; i < answer.size(); i++){
            sb.append(answer.get(i)).append('\n');
        }
        System.out.print(sb.toString());
    }
}