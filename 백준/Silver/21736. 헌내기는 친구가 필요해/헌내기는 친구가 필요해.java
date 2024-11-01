import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int startX = -1;
		int startY = -1;
		
		String[][] campus = new String[N][M];
		
		for (int i = 0; i < N; i++) {
			campus[i] = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				if (campus[i][j].equals("I")) {
					startX = i;
					startY = j;
				}
			}
		}
		
		int[] dx = new int[]{-1, 1, 0, 0};
		int[] dy = new int[]{0, 0, -1, 1};
		
		boolean[][] visited = new boolean[N][M];
		visited[startX][startY] = true;
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{startX, startY});
		
		int cnt = 0;
		
		while (!queue.isEmpty()) {
			int[] XY = queue.poll();
			int x = XY[0];
			int y = XY[1];
			
			for	(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny] && !campus[nx][ny].equals("X")){
					visited[nx][ny] = true;
					queue.offer(new int[]{nx, ny});
					if (campus[nx][ny].equals("P")) cnt++;
				}
			}
		}
		if(cnt == 0){
			System.out.println("TT");
		}else{
			System.out.println(cnt);
		}
		br.close();
	}
}